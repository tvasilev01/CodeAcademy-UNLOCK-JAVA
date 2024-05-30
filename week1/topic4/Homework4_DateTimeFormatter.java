package week1.topic4;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Homework4_DateTimeFormatter {
    public static void main(String[] args) {

        /*
        Разгледайте класа DateTimeFormatter и напишете програма, която отпечатва текущата дата по
        различни начини - само времето, само датата.
        Пробвайте и използването на ISO_LOCAL_DATE, ISO_OFFSET_DATE, RFC_1123_DATE_TIME
         */

        Date date = new Date();

        //текущото време
        System.out.printf("%tT%n", date);

        //текущата дата
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);

        //ISO_LOCAL_DATE
        String dt = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now());
        System.out.println(dt);

        //ISO_OFFSET_DATE
        String dt2 = DateTimeFormatter.ISO_OFFSET_DATE.format(OffsetDateTime.now());
        System.out.println(dt2);

        //RFC_1123_DATE_TIME
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.getDefault());
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        String rfc1123DateTime = sdf.format(date);

        System.out.println(rfc1123DateTime);
    }
}
