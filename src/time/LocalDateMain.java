package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘날짜: " + nowDate);
        LocalDate ofDate = LocalDate.of(2013, 11, 7);
        System.out.println("지정날짜 = " + ofDate);
        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
