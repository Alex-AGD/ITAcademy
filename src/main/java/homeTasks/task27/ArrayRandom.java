package main.java.homeTasks.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayRandom {
    public static void main(String[] args) {
        int a = 20;
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            value.add(i, (int) (Math.random() * 20 + 1));}
            Set<Integer> values = new HashSet<>(value);

            System.out.println(values);

        }

}