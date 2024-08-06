package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2012, 1, 1, 12, 30, 59);
        System.out.println("YEAR =" + dt.get(ChronoField.YEAR));
        System.out.println("MONTH = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("MINUTE OF HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND OF MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR =" + dt.getYear());
        System.out.println("MONTH = " + dt.getMonthValue());
        System.out.println("DAY = " + dt.getDayOfMonth());
        System.out.println("MINUTE OF HOUR = " + dt.getHour());
        System.out.println("SECOND OF MINUTE = " + dt.getMinute());

        System.out.println("편의 메서드 제공 안함");
        //분 이하 단위의 값들 다 합친 것
        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
