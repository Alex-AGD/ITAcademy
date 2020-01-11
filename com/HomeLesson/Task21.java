package com.HomeLesson;

public class Task21 {
    public static void main(String[] args) {
        String str1 = "Java have say";
        String str2 = "Hello";
        System.out.println(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            String str3 = str1 + " " + str2;
            System.out.print(str3);
            System.out.println();
        }

        String[] fields = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        String s = "";
        for (int i = 0; i < fields.length; i++) {
            s = s + fields[i];
            System.out.println(s);

        }
        String[] fieldsTwo = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder j = new StringBuilder();
        for (int i = 0; i < fieldsTwo.length; i++) {
            j.append(fields[i]);
            System.out.println(j);
        }
    }
}