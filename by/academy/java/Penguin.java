package by.academy.java;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "Fly,jump";


    }
}
