package main.java.workHome.polimorf_incasul_classroom;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "Fly,jump";


    }
}
