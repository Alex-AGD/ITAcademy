package com.HomeLesson;

public class Task19 {
    public static void main(String[] args) {
        String str = "Test string, with several,  characters and commas.";
        str = str.replaceAll("  ", " ");
        int count = 0;
        count++;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ')
                count ++;

        }
        System.out.println("Вы ввели "+count+" слов");
    }


}

