package nested.nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar=1;

        //지역 클래스는 public, private같은 접근 제어자를 지역 변수와 같이 쓸 수 없다.
        class LocalPrinter {
            int value =0;

            public void printData(){
                //지역 클래스의 멤버 변수
                System.out.println("value = " + value);

                //지역변수
                System.out.println("localVar = " + localVar);

                //매개변수도 지역변수의 한 종류
                System.out.println("paramVar = " + paramVar);

                //지역 클래스는 바깥 클래스의 인스턴스에 소속되므로 변수 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }

        //process라는 코드블럭 안에서만 localPrinter 클래스 호출 가능
        LocalPrinter printer = new LocalPrinter();
        printer.printData();

    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
