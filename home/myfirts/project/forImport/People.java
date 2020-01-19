package home.myfirts.project.forImport;

public class People {
    private String name;
    private String lastName;
    private int age;


    private Party party;


    public People(String name, String lastName, int age, Party party) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.party = party;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }



    @Override
    public String toString() {
        return " Имя: " + name + " ,Фамилия " + lastName +  " , Возраст" + age  + " Тусовка на:" + party;
    }
}
