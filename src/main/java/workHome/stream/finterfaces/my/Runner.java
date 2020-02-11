package by.academy.stream.finterfaces.my;

import java.util.function.Predicate;

public class Runner {

    public static void main(String[] args) {

        MyFuncInterface myFuncInterface = s -> s.length() >= 5;
        System.out.println(myFuncInterface.moreThen("Lena"));

        Predicate<String> predicate = x -> x.length() >= 5;
        System.out.println(predicate.test("Helen"));
    }
}
