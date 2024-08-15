package nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar=1;

        //지역 클래스는 public, private같은 접근 제어자를 지역 변수와 같이 쓸 수 없다.
        //지역 클래스 인터페이스 구현 가능
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                //지역 클래스의 멤버 변수
                System.out.println("value = " + value);

                //지역변수
                System.out.println("localVar = " + localVar);

                //매개변수도 지역변수의 한 종류
                System.out.println("paramVar = " + paramVar);

                //지역 클래스는 바깥 클래스의 인스턴스에 소속되므로 변수 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class="+printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
