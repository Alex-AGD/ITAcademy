package workHome.stream.common.with;


import workHome.stream.common.bean.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {


    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<Cat>() {{
            add(new Cat("Murzik", 1));
            add(new Cat("Sharik", 2));
            add(new Cat("Kolya", 3));
            add(new Cat("Barsik", 4));
            add(new Cat("Ugalek", 5));
        }};

        List<String> names = cats.stream()
                .map(cat -> cat.getName())
                    .collect(Collectors.toList());
        System.out.println(names);
    }
}
