package main.java.homeTasks.taskIO.file;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\project\\ItAcademy\\src\\main\\resources\\newFile.txt");
        if(!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(f1.canWrite());


    }
}
