package main.java.homeTasks.task19;

public class Task19 {
    public static void main(String[] args) {
/*        String str = " String  with, spaces  dots.. ";
        str = str.replaceAll("  ", " ");
        str =str.trim();
        int count = 0;
        count++;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ')
                count ++;

        }
        System.out.println("Вы ввели "+count+" слов");
    }*/
        String str = " Test string, with sev, char and commas dfg";
        str = str.replaceAll("[.,:;-]", "");
        str = str.trim();
        String[] words = str.split(" ");


        StringBuilder newStr = new StringBuilder();
        for (String word : words) {
            newStr.append(word.length());
            System.out.print(newStr.length());


        }
    }
}

