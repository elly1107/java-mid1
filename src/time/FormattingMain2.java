package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //formatting: date and time to string
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(formatter);
        System.out.println("format = " + format);
        System.out.println(now);

        //parsing: string to date and time
        String dateTimeString = "2030-01-01 13:50:39";
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parse = " + parse);
    }
}
