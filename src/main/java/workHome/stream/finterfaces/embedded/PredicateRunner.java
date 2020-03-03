package workHome.stream.finterfaces.embedded;

import java.util.function.Predicate;

public class PredicateRunner {

    public static void main(String[] args) {

        System.out.println("public interface Predicate<T> {\n" +
                "    boolean test(T t);\n" +
                "}");

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
    }
}
