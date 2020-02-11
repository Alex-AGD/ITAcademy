package main.java.homeTasks.datetimeapiElena.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Birthday {

    public static void main(String[] args) {
        getBirthday();
    }

    private static void getBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate MyBirthday = LocalDate.of(1992, Month.OCTOBER, 18);

        Period period = Period.between(MyBirthday, today);
        long myDays = ChronoUnit.DAYS.between(MyBirthday, today);
        String result = String
                .format("You are %s years, %s months, and %s days old. (%s days total)",
                        period.getYears(),
                        period.getMonths(),
                        period.getDays(),
                        myDays);
        System.out.println(result); // You are 27 years, 3 months, and 16 days old. (9969 days total)
    }
}
