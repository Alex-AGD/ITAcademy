package main.java.workHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {


        String text = "When the 0x6F men on the chessboard\n" +
                "get up and tell 0x7AAF  you where 0x7FFF 0x07 to go\n";


        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            System.out.println(m.group());

        }
    }
}
