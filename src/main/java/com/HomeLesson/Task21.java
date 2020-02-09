package com.HomeLesson;

public class Task21 {
    public static void main(String[] args) {

        String str1 = "Java have say";
        String str2 = "Hello";
        String str3 = "Hello2";
        String str4 = "Hello3";
        System.out.println(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            String str6 = str1 + " " + str2 + " " + str3 + " " + str4;
            System.out.print(str6);
            System.out.println();

        }
        long startTime = System.currentTimeMillis();
        String[] fields = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        String s = "";
        for (String field : fields) {
            s = s + field;
            System.out.println(s);

            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
            System.out.println();
        }
        String[] fieldsTwo = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder j = new StringBuilder();
        for (String value : fieldsTwo) {
            j.append(value);
            System.out.println(j);
            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
        }
    }
}