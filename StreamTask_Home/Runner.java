package StreamTask_Home;

import java.util.*;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("John", 14),
                new Person("Sam", 34),
                new Person("Din", 21),
                new Person("Kas", 20),
                new Person("Lucifer", 10)
        ));

        Comparator<Person> byName = Comparator.comparing(Person::getName); //use link  getName

        Comparator<Person> byAge = Comparator.comparing(person -> person.getAge()); //use lambda

        persons.sort(byAge.thenComparing(byName)); //sort


        System.out.println(persons);
        System.out.println("-------------------------------");

        persons.forEach(person -> System.out.println(person)); // can replace link println

        System.out.println("-------------------------------");
        for (Person i : persons) {
            System.out.println(i);
        }

    }

}