package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
        //LocalDate는 년월일만 존재하므로 컴파일 오류
    }
}
