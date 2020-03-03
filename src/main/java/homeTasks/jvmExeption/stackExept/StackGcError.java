package homeTasks.jvmExeption.stackExept;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StackGcError {
    public static void main(String[] args) {
        Map<Long, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextLong(), String.valueOf(r.nextLong()));

            System.out.println(r);

        }
    }
}
