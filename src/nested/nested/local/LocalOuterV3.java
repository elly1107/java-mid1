package nested.nested.local;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar=1;

        //지역 클래스는 public, private같은 접근 제어자를 지역 변수와 같이 쓸 수 없다.
        //지역 클래스 인터페이스 구현 가능
        class LocalPrinter implements Printer{
            int value =0;//지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

            @Override
            public void print() {
                //지역 클래스의 멤버 변수
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다
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
        return printer;

    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}
