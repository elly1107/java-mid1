package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime Seoul = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        //ZonedDateTime Seoul = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));

        System.out.println("Seoul = " + Seoul);

        ZonedDateTime London = Seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("London = " + London);

        ZonedDateTime NewYork = Seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("NewYork = " + NewYork);
    }
}
