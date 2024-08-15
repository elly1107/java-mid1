package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {


    public static void hello(Process a) {
        System.out.println("프로그램 시작");
        a.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

       hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
       });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}