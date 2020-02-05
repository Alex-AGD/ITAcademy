package StreamApi_Lamda.Interfaces_construct_link;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Consumer<String> printers = System.out::println;
                                    //___________ передаем ссылку println на метод accept
        //printers.accept("Hello consumer");

        Consumer<String> printer = Main::println; // ничего не понял... сделали ссылку на статический метод в классе майн
        printer.accept("Hello hugo");

        Database database = User::new; // создание ссылки на коструктор
        User user = database.create("Den", "1990"); // передаем в  конструктор класса user тексе переменные лог и пасс
        System.out.printf("Name:  %s%nPassword: %s", user.getName(), user.getPassword());




    }
        private static void println(String text){
            System.out.println(text);
        }
    }


