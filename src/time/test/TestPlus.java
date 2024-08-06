package time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime result = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("result = " + result);
    }
}
