package main.java.homeTasks.stream.finterfaces.embedded;

import java.util.function.Consumer;

public class ConsumerRunner {

    public static void main(String[] args) {

        System.out.println("public interface Consumer<T> {\n" +
                "    void accept(T t);\n" +
                "}");

        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
