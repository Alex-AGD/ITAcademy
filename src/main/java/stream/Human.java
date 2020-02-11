package main.java.stream;

public class Human implements Comparable<Human> {
    private String name;
    private Integer age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Human h) {
        //return name.compareTo(h.getName());
        return age.compareTo(h.getAge()); //почему то не прнимает примитивный тип int
        //return name.length()-h.getName().length(); //можем опр свою логику сравнения не полагаясь на внутр мех
    }
/*
    @Override
    public int compare(Human a, Human b) {
        return a.getName().compareTo(b.getName()); // можем исп компаратор
    }
*/
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

