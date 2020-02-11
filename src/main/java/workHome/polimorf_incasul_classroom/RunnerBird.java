package main.java.workHome.polimorf_incasul_classroom;

public class RunnerBird {

    public static void main(String[] args) {


        Penguin penguin = new Penguin("");
        penguin.setName("Pupkin");

        Duck duck = new Duck("");
        duck.setName("Утка");

        Ostrich ostrich = new Ostrich("");
        ostrich.setName("СтраусЖора");


        System.out.println(penguin.name + " " + penguin.move());
        System.out.println(duck.name + " " + duck.move());
        System.out.println(ostrich + " " + ostrich.move());

        printMove(duck);
        printMove(ostrich);
        printMove(penguin);
    }
    public static void printMove(Bird bird) {
        System.out.print(bird.move());
    }
}
