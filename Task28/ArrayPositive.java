package Task28;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayPositive {

    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            Integer b = (int) (Math.random() * 10 + 1);
            mark.add(i, b);
        }
        System.out.println(mark);

        System.out.println("Макс оценка " + Collections.max(mark));

    }
}
