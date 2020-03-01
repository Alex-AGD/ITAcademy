package homeTasks.taskIO.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CatExternalize implements Externalizable {
    private String name;
    private transient String secretName;
    private String breed;
    private int age;
    private int tail;

    public CatExternalize() {
    }

    public CatExternalize(String name, String secretName, String breed, int age, int tail) {
        this.name = name;
        this.secretName = secretName;
        this.breed = breed;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "CatExternalize{" +
                "name='" + name + '\'' +
                ", secretName='" + secretName + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeObject(this.getSecretName());
        out.writeObject(this.getBreed());
        out.writeObject(this.getTail());
        out.writeObject(this.getAge());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        secretName = (String) in.readObject();
        breed = (String) in.readObject();
        tail = (int) in.readObject();
        age = (int) in.readObject();
    }
}
