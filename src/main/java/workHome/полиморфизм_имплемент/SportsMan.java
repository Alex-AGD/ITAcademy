package main.java.workHome.полиморфизм_имплемент;

public class SportsMan extends Child {

    private String typeSport;

    public SportsMan(String race, String eyesColor, String hairColor, String name, String lastName, int age, String typeSport) {
        super(race, eyesColor, hairColor, name, lastName, age);
        this.typeSport = typeSport;
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public void sayHello() {
        System.out.println("Я был ребенком");
    }

    @Override
    public void sayHello(int x) {

    }

    @Override
    public void sayHello(String Hello2) {
        System.out.println("Я был ребенком");
    }

}

