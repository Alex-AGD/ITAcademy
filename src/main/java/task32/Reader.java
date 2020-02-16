package main.java.task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static void main(String[] args) throws IOException {

        DataInputStream read;
        try {
            read = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/resources/random.txt")));
        } catch (FileNotFoundException e) {
            System.out.print("File Not Found");
            return;
        }

        List<Integer> ints = new ArrayList<>();
        double sum = 0;

        while (true) {
            try {
                ints.add(read.readInt());
                for (Integer anInt : ints) {
                    sum += anInt;
                }
            } catch (EOFException eof) {
                break;
            }
        }
        System.out.println(ints);
        System.out.println("Average : " + sum / ints.size());
        read.close();
    }
}




