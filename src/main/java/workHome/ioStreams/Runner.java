package workHome.ioStreams;


import java.io.*;

public class Runner {
    public static void main(String[] args) {

        File file = new File("Example.txt");

        // Создание файла
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Создание объекта FileWriter
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Запись содержимого в файл
        try {
            writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Создание объекта FileReader
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        char [] a = new char[200];   // Количество символов, которое будем считывать
        try {
            fr.read(a);   // Чтение содержимого в массив
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



