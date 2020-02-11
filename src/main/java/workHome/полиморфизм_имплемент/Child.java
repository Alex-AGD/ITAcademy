package main.java.workHome.полиморфизм_имплемент;

public abstract class Child extends Human {
    private String name;
    private String lastName;
    private int age;


    public Child(String race, String eyesColor, String hairColor, String name, String lastName, int age) {
        super(race, eyesColor, hairColor);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String getEyesColor() {
        return super.getEyesColor();
    }

    @Override
    public void setEyesColor(String eyesColor) {
        super.setEyesColor(eyesColor);
    }

    @Override
    public String getHairColor() {
        return super.getHairColor();
    }

    @Override
    public void setHairColor(String hairColor) {
        super.setHairColor(hairColor);
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void EyesColor(String eyes) {

    }

    public abstract void sayHello(int x);

    public abstract void sayHello(String Hello2);
}

