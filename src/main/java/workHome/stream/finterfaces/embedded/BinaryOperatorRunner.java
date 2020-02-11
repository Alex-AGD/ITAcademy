package main.java.workHome.stream.finterfaces.embedded;

import java.util.function.BinaryOperator;

public class BinaryOperatorRunner {

    public static void main(String[] args) {

        System.out.println("public interface BinaryOperator<T> {\n" +
                "    T apply(T t1, T t2);\n" +
                "}");

        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20
    }
}
