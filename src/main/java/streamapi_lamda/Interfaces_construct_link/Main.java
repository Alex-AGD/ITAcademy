package main.java.streamapi_lamda.Interfaces_construct_link;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Consumer<String> printers = System.out::println;
        //___________ передаем ссылку println на метод accept
        //printers.accept("Hello consumer");

        Consumer<String> printer = Main::println; // ничего не понял... сделали ссылку на статический метод в классе майн
        //сделал ссылку на метод статический prinln ниже
        printer.accept("Hello hugo");

        Database database = User::new; // создание ссылки на коструктор
        User user = database.create("Den", "1990", "sfds"); // передаем в  конструктор класса user тексе переменные лог и пасс
        User user1 = database.create("Deni", "1992", "45345"); // передаем в  конструктор класса user тексе переменные лог и пасс
        System.out.printf("Name:  %s%nPassword: %s", user.getName(), user.getPassword());
        System.out.println("\n--------------------");
        System.out.printf("Name:  %s%nPassword: %s", user1.getName(), user1.getPassword());
    }

    private static void println(String text) {
        System.out.println(text);
    }
}


