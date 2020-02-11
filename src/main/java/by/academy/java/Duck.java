package main.java.by.academy.java;

public class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "fly, jump,sleep";
   }
}
