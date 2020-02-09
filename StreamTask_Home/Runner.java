package StreamTask_Home;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
       List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("John", 14),
                new Person("Sam", 34),
                new Person("Din", 21),
                new Person("Kas", 20),
                new Person("AKas", 20),
                new Person("AbKas", 20),
                new Person("Lucifer", 10)
        ));

        Comparator<Person> byName = Comparator.comparing(Person::getName); //use link  getName
        persons.sort(byName);

        Comparator<Person> byAge = Comparator.comparing(person -> person.getAge()); //use lambda
        persons.sort(byAge.thenComparing(byName)); //sort

        System.out.println(persons);
        System.out.println("-------------------------------");
        persons.forEach(person -> System.out.println(person)); // can replace link println
        System.out.println("-------------------------------");
        for (Person i : persons) {
            System.out.println(i);

            System.out.println("------------------------");

            persons.stream().sorted(byAge.thenComparing(byName)).forEach(System.out::println);
            List<Person> names = (List<Person>) persons.stream().collect(Collectors.toSet());


                                //Not Watch This()it's for me.
            /*         //Comparator<Human> hcompName = Comparator.comparing(Human::getName);
         List<Human> humans = new ArrayList<Human>(){{
             add (new Human("Vasilii",14));
             add (new Human("Vovka",9));
             add (new Human("Aruno",58));
             add (new Human("Marisa",45));
             add (new Human("Aruno",45));
             add (new Human("Azaza",18));
}};
        Comparator<Human> hcompAge = Comparator.comparing(Human::getAge);
        humans.sort(hcompAge);
        humans.forEach(human -> System.out.println(humans));

        Collections.sort(humans);
         for (Human u:humans)
            System.out.println(u);
        }*/

    }}}

