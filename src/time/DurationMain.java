package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plus = lt.plus(duration);
        System.out.println("plus = " + plus);

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(11, 0);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between.getSeconds());
        System.out.println(between.toHours()+"시간"+between.toMinutesPart()+"분");
    }
}
