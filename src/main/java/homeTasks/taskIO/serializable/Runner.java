package main.java.homeTasks.taskIO.serializable;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //save cat to file сериализация
        CatSerializable catSerializable = new CatSerializable("Pop", 23, 13);
        catSerializable.getName("Кот");
        FileOutputStream fileOutput = new FileOutputStream("D:\\project\\ItAcademy\\src\\main\\resources\\cat.dat"); //запись данных в файл
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput); //преобразует  обьект в байты
        outputStream.writeObject(catSerializable);
        outputStream.close(); // по идее должен с ним и закрыться второй поток object
        //fileOutput.close();
        System.out.println();

        //load десериализация
        FileInputStream fiStream = new FileInputStream("D:\\project\\ItAcademy\\src\\main\\resources\\cat.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();

        System.out.println(object);

        CatSerializable newCatSerializable = (CatSerializable) object;


    }
}
