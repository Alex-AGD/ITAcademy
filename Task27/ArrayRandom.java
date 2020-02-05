package Task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayRandom {
    public static void main(String[] args) {
        int a = 20;
        ArrayList<Integer> value = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            value.add(i, (int) (Math.random() * 20 + 1));
            Set<Integer> valNtDbl = new HashSet<>(value);
            System.out.println(valNtDbl);

        }
    }
}
