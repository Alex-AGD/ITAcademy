package by.academy.java;

public class Runner {

    public static void main(String[] args) {




        Penguin penguin = new Penguin("");
        Duck duck = new Duck("");
        Ostrich ostrich = new Ostrich("");

        System.out.println(penguin.move());
        System.out.println(duck.getName());
        System.out.println(ostrich.name);
        ostrich.setName("dfg");
        penguin.setName("Pupkin");


        printMove(duck);
        printMove(ostrich);
        printMove(penguin);

    }

    public static void printMove(Bird bird) {
        System.out.print(bird.move());

    }
}
