package workHome.polimorf_incasul_classroom;

public abstract class Bird {
    public abstract String move();

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(String name) {
        this.name = name;
    }
}
