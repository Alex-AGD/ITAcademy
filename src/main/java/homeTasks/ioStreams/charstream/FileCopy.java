package main.java.homeTasks.ioStreams.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("......\\example.txt");
             FileWriter fileWriter = new FileWriter("......\\copied_example.txt")) {

            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
            }
        }
    }
}
