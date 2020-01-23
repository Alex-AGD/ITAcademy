package com.HomeLesson;

public class Task18 {
    public static void main(String[] args) {

        String str = "Test string,, with several,,  characters and commas...";
        int c = 0;
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',')
                n++;
        }
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '.')
                c++;
        }
        System.out.println("We have " + n + " commas " + c + " dots");
    }
}
