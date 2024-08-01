package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간 밀리초
        System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간 나노초
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경변수를 읽는다. (운영체제가 사용하는)
        System.out.println(System.getenv());

        //시스템 속성을 읽는다. (자바가 사용하는)
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        //배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
