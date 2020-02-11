package main.java.homeTasks.datetimeapiElena.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class LocalDTFormat {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.YYYY");
        System.out.println(dateTimeFormatter.format(localDate));  //  3.02.2020

        try {
            System.out.println(dateTimeFormatter.format(localTime));
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Wrong formatter.\nЭто время дня, и оно ничего не знает о том, какой сейчас месяц, день и год.");
        }

        System.out.println(dateTimeFormatter.format(localDateTime)); //  3.02.2020
    }
}
