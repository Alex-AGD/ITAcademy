package main.java.workHome.ioStreams.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("D:\\project\\ItAcademy\\Example.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("D:\\project\\ItAcademy\\Example_copied.txt")) {

            int a;
            while ((a = fileInputStream.read()) != -1) { //цикл в котром идет по длине массива -1 флаг конец
                fileOutputStream.write(a);
            }
        }
    }
}

