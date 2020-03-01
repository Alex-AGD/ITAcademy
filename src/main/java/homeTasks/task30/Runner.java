package homeTasks.task30;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/example.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/main/resources/Task31.txt")));

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
        reader.close();
    }
}



