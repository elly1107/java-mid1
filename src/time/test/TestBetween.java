package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 11);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM개월 dd일");
        Period pe = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("남은 기간: "+pe.getYears() + "년 " + pe.getMonths() + "개월 " + pe.getDays() + "일");
        System.out.println("남은 일수: "+ daysBetween);
    }
}
