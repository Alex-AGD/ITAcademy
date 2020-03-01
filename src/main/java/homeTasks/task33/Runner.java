package homeTasks.task33;

import java.io.File;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) {

        File dir = new File("D:\\project\\ItAcademy\\src\\main\\java\\workHome\\streamapi_lamda");
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                } else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}

