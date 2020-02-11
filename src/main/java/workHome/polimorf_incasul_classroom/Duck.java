package main.java.workHome.polimorf_incasul_classroom;

public class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "fly, jump,sleep";
   }
}
