package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process a) {
        System.out.println("프로그램 시작");
        a.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        class Dice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Dice dice = new Dice();
        hello(dice);
        Sum sum = new Sum();
        hello(sum);
    }
}