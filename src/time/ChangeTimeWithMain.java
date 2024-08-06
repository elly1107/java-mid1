package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2023, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime with = dt.with(ChronoField.YEAR, 2020);
        System.out.println("with = " + with);

        LocalDateTime with1 = dt.withYear(2020);
        System.out.println("with1 = " + with1);

        //TemporalAdjuster 사용
        //다음주 금요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("with2 = " + with2);

        //그 달의 마지막 일요일
        LocalDateTime with3 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("with3 = " + with3);
    }
}
