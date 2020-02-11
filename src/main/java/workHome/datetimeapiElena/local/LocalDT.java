package main.java.workHome.datetimeapiElena.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDT {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        LocalDateTime fromLocalTime = time.atDate(date);
        LocalDateTime fromDateTime = date.atTime(time);

        System.out.println(fromDateTime);   // 2020-02-03T17:04:02.800
        System.out.println(fromLocalTime);  // 2020-02-03T17:04:02.800

        fromDateTime = date.atTime(23,59,57,01);
        System.out.println(fromDateTime);  //  2020-02-03T23:59:57.000000001
    }
}
