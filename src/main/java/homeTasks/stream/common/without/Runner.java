package main.java.homeTasks.stream.common.without;


import main.java.homeTasks.stream.common.bean.Cat;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<Cat>() {{
            add(new Cat("Murzik", 1));
            add(new Cat("Sharik", 2));
            add(new Cat("Kolya", 3));
            add(new Cat("Barsik", 4));
            add(new Cat("Ugalek", 5));
        }};

        List<String> names = getCatNames(cats);
        for (String name : names) {
            System.out.println(name);
        }

    }

    private static List<String> getCatNames(List<Cat> cats) {
        List<String> names = new ArrayList<String>();
        for (Cat cat : cats) {
            names.add(cat.getName());
        }
        return names;
    }
}
