package main.java.workHome.streamapi_lamda;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    ///// Функциональные интерфесы!!!
    public static void main(String[] args) {

        //  <--- Исп внутренний anonym class
        Operation operation = Double::sum;

        System.out.println(operation.getResult(2.0, 2.0));

        Operation lambda = ((a, b) -> Double.sum(a, b));//lamda выражение
        System.out.println(lambda.getResult(3.0, 3.0));

        Printer printer = System.out::println; // однострочное lamda выраж
        printer.println("Hello lamda");

        OperatorWithJeneric<Integer> addition = ((a, b) -> Integer.sum(a, b)); // пример с дженериками
        System.out.println(addition.getResult(2, 2));

        OperatorWithJeneric<String> concatenation = ((value1, value2) -> value1 + value2); // пример с дженериками
        System.out.println(concatenation.getResult("Hello", "LamJen"));

        Predicate<Integer> isZero = value -> value == 0; //метод для проверки выполнения какого либо условия еслжа то возр true
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        Consumer<String> printers = System.out::println; // выполняет какое либо дейст над обьектом
        // типо <T> в нашем случае String добавляем текст :)
        printers.accept("Hello consumer");

        Function<Integer, Double> converter = Double::valueOf; // конвертирует <T в G>
        System.out.println(converter.apply(1));


        Supplier<String> text = () -> {         //метод get интерфейса suppler не принимает никаких аргументов но вазращает обьект типа T
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());

        UnaryOperator<Double> sqrt = Math::sqrt; // унарный оператор позволяет выполнять унарные операции
        // над обьектом типа Т (например корень от числа sqrt
        System.out.println(sqrt.apply(4.0));

        BinaryOperator<Double> pow = Math::pow; //позволяет выполнять бинарные операции над T и U например степень
        System.out.println(pow.apply(2.0, 5.0));

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResult(5));
    }
}
