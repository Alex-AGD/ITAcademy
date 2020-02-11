package main.java.homeTasks.task20;

public class Task20 {
    public static void main(String[] args) {
        String str = "Test string, with sev, char and commas";
        str = str.replaceAll("[.,:;-]", "");
        String[] words = str.split(" ");

        StringBuilder newStr = new StringBuilder();
        for (String word : words) {
            newStr.append(word.charAt(word.length() - 1));
        }

        System.out.print(newStr);
    }
}
