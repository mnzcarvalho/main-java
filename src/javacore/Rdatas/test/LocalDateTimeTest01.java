package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2026, Month.OCTOBER, 27);
        date = LocalDate.parse("2026-10-27");
        LocalTime time = LocalTime.of(9, 45, 23);
        time = LocalTime.parse("09:45:23"); //tem q ter os 6 dígitos
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);
    }
}
