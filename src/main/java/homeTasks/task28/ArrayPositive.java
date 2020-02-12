package main.java.homeTasks.task28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayPositive {

    public static void main(String[] args) {
        //int element = 10;
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int b = (int) (Math.random() * 10);
            mark.add(i, b);
            //Iterator<Integer> iterator = mark.iterator();
            //mark.removeIf(integer -> (b>=10));
            System.out.println(mark.toString());
        }
        System.out.println(mark);

        System.out.println("Макс оценка " + Collections.max(mark));

        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 1000)
                .parallel()
                .forEach(ints::add);
        System.out.println(ints.size());
    }
}