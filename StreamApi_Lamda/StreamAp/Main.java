package StreamApi_Lamda.StreamAp;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        int[] nums = {-2, -1, 0, 1, 2};
        for (int number : nums) {
            if (number < 0) System.out.println(number);
        }

        IntStream.of(-2, -1, 0, 1, 2).filter(value -> value < 0).forEach(System.out::println);
                                     //промежуточн оперц        //терминальнальн оперц
                                                      //условие
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);


        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
        System.out.println(streamFromIterate.toString());
    }
}
