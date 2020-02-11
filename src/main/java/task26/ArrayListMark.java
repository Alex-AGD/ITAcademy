package main.java.task26;

import java.util.ArrayList;

public class ArrayListMark {
    public static void main(String[] args) {
        int positive = 10;
        int negative = 3;

        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < positive; i++) {
            value.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println(value);
        value.removeIf(integer -> integer <= negative);
        System.out.println(value);
    }
}