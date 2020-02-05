package Task29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreqDict {

    public static void main(String[] args) throws Exception {

        String text = "When the men on the chessboard\n" +
                "get up and tell you where to go\n" +
                "And you’ve just had some kind of mushroom,\n" +
                "and your mind is moving low\n" +
                "\n" +
                "Go ask Alice, I think she’ll know\n" +
                "\n" +
                "When logic and proportion\n" +
                "have fallen sloppy dead\n" +
                "And the white knight is talking backwards\n" +
                "And the red queen’s off with her head\n" +
                "Remember what the dormouse said\n" +
                "Feed your head, feed your head.";

        String[] textTwo = text.split("[\\s,.\\-!?]+");
        System.out.println(Arrays.toString(textTwo));

        ArrayList<String> list = new ArrayList<>(Arrays.asList(textTwo)); //aslist метод предст наш масив текст в виде списка
        Map<String, Integer> map = countWords(list);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : list) {
            result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1); //this sting breaks my brains :|
        }
        return result;
    }

}
//