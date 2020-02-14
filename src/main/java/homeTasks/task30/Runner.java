package main.java.homeTasks.task30;

import java.io.*;

public class Runner {


    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/example.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;
        int words = 0;
        int punctuationMarks = 0;

        while ((line = reader.readLine()) != null) {
            String[] wordList = line.split((" "));
            words += wordList.length;

            String[] markslist = line.split(("[!?.,:]"));
            punctuationMarks += markslist.length;
        }
        System.out.println("Total words = " + words);
        System.out.println("Total punctuation marks = " + punctuationMarks);
    }
}








