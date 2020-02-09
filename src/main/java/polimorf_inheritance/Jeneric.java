package polimorf_inheritance;

public class Jeneric<T,S,G> {
    private T name;
    private S lastName;
    private G age;

    @Override
    public String toString() {
        return "Jeneric{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", age=" + age +
                '}';
    }

    public Jeneric(T name, S lastName, G age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public S getLastName() {
        return lastName;
    }

    public void setLastName(S lastName) {
        this.lastName = lastName;
    }

    public G getAge() {
        return age;
    }

    public void setAge(G age) {
        this.age = age;
    }
}
