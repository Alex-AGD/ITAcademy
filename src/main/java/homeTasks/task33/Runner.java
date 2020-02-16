package main.java.homeTasks.task33;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) throws IOException {

        File dir = new File("D:\\project\\ItAcademy\\src\\main\\java\\workHome\\streamapi_lamda");
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                } else {
                    System.out.println(item.getName() + "\t file");
                } }
        } }
}

