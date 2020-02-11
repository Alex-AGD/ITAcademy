package main.java.homeTasks.task22;

import java.util.Scanner;

public class RunnerTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");

        Time now = new Time(in.nextInt());
        System.out.println(now);


        System.out.println();
        Time nowTwo = new Time(0, 0, 5);
        System.out.println(nowTwo);


        final int i = now.hashCode();
        final int x = nowTwo.hashCode();



        System.out.println("Method now == Method now2? " + now.equals(nowTwo));


    }
}
