package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2000, 11, 7, 20, 1, 2);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);

        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println("ofDtPlusYear = " + ofDtPlusYear);

        //비교
        System.out.println("현재 날짜가 지정 날짜보다 이전인가?" + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜가 지정 날짜보다 이후인가?" + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜가 지정 날짜와 같은가?" + nowDt.isEqual(ofDt));
    }
}
