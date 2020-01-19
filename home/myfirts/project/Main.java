package home.myfirts.project;

import home.myfirts.project.forImport.Party;
import home.myfirts.project.forImport.People;

public class Main {

    static People people;
    static Party party; //обьект


    //static People people = new People();
    //static Patry party = new Patry(); //созданиём обьект дальше можем вызвать через this. т.е party.set or get


    public static void main(String[] args) {

        party = new Party(2, "Дом имя", true);
        people = new People("Жопер", "Пупкин", 16, party);


 /*     party.setDomName("Мазурова 131");
        party.setBerserk(true);                     // вызов геттеров без конструктора
        party.setSkolkoVodki(2);;*/

/*      people.setName("Maksim");
        people.setLastName("Gulevich");             // вызов геттеров без конструктора
        people.setAge(3);*/

        people.setParty(party);
        people.getParty().setDomName("Переместились на другой дом");

        System.out.println(people);
        party.rush();                               //обращение к party вызов метода  из него rush
        people.getParty().rush();                   //вызов метода rush через обьект people
        party.crashFace();                          //вызов метода с класса party

        Berserk berserk = new Berserk(11,"Мжк",true);
        berserk.setTypeImmuneAllAtack("Иммун ко всем атакам");
        berserk.crashFace();                        // вызов уже переопределенного метода



    }
}

