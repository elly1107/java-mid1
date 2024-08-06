package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate currentDate = LocalDate.of(2023, 2, 2);
        System.out.println("currentDate = " + currentDate);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("plusDate = " + plusDate);

        LocalDate startDate = LocalDate.of(2023, 2, 2);
        LocalDate endDate = LocalDate.of(2024, 1, 1);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
        System.out.println("기간: "+between.getMonths()+"개월 "+between.getDays()+"일");

    }
}
