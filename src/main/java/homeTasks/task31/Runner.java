package homeTasks.task31;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/main/resources/task31.txt")));

        String str;
        List<Integer> ints = new ArrayList<>();

        while ((str = reader.readLine()) != null) {
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find())
                ints.add(Integer.parseInt(matcher.group()));

        }
        int sum = ints.stream()
                .mapToInt(a -> a)
                .sum();

        List<Integer> dub = ints.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Numbs in our text " + ints);
        System.out.println("Sum all numbs " + sum);
        System.out.println("Numbs with no duplicate " + dub);
        reader.close();
    }
}


