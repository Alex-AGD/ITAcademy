package StreamApi_Lamda;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        Operation operation = new Operation() {     //  <--- Исп внутренний anonym class
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };

        System.out.println(operation.getResult(2.0, 2.0));

        Operation lambda = ((value1, value2) -> value1 + value2);  //lamda выражение
        System.out.println(lambda.getResult(3.0, 3.0));

        Printer printer = string -> System.out.println(string); // однострочное lamda выраж
        printer.println("Hello lamda");


        Operator_with_jeneric<Integer> addition = ((value1, value2) -> value1 + value2); // пример с дженериками
        System.out.println(addition.getResult(2, 2));

        Operator_with_jeneric<String> concatenation = ((value1, value2) -> value1 + value2); // пример с дженериками
        System.out.println(concatenation.getResult("Hello", "LamJen"));

        Predicate<Integer> isZero = value -> value == 0; //метод для проверки выполнения какого либо условия еслжа то возр true
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        Consumer<String> printers = string -> System.out.println(string); // выполняет какое либо дейст над обьектом
        // типо <T> в нашем случае String добавляем текст :)
        printers.accept("Hello consumer");

        Function<Integer, Double> converter = value -> Double.valueOf(value); // конвертирует <T в G>
        System.out.println(converter.apply(1));


        Supplier<String> text = () -> {         //метод get интерфейса suppler не принимает никаких аргументов но вазращает обьект типа T
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());


        UnaryOperator<Double> sqrt = value -> Math.sqrt(value); // унарный оператор позволяет выполнять унарные операции
        // над обьектом типа Т (например корень от числа sqrt
        System.out.println(sqrt.apply(4.0));


        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1,value2); //позволяет выполнять бинарные операции над T и U например степень
        System.out.println(pow.apply(2.0,5.0));


/*        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResult(5));*/


    }
}
