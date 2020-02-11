package main.java.homeTasks.stream.finterfaces.embedded;

import java.util.function.UnaryOperator;

public class UnaryOperatorRunner {

    public static void main(String[] args) {

        System.out.println("public interface UnaryOperator<T> {\n" +
                "    T apply(T t);\n" +
                "}");

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25
    }
}
