package main.java.workHome.stream.finterfaces.embedded;

import java.util.function.Function;

public class RunnerFunction {

    public static void main(String[] args) {

        System.out.println("public interface Function<T, R> {\n" +
                "    R apply(T t);\n" +
                "}");

        Function<Integer, String> convert = x -> x + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов
    }
}
