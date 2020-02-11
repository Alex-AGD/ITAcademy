package main.java.workHome.datetimeapiElena.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocatToString {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime); // 17:00:59.276
        System.out.println(localDate); // 2020-02-03
        System.out.println(localDateTime); // 2020-02-03T17:00:59.276
    }
}
