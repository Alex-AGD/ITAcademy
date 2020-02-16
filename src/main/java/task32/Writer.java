package main.java.task32;

import java.io.*;

public class Writer {
    public static void main(String[] args) throws IOException {

        DataOutputStream rand;
        try {
            rand = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/resources/random.txt")));
        } catch (FileNotFoundException e) {
            System.out.print("File Not Found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            rand.writeInt((int) (Math.random() * 10));
        }
        rand.close();
        System.out.println();

    }
}
