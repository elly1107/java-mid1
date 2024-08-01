package lang.math.test;

import java.util.Random;

public class mylotto {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("로또 번호:");
        for (int i=0; i<6; i++) {
            System.out.print(" "+(random.nextInt(45)+1));
        }
    }
}
