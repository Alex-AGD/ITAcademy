package main.java.homeTasks.taskIO.serializable;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //save cat to file сериализация
        CatSerializable catSerializable = new CatSerializable("Pop", 23, 13);
        FileOutputStream fileOutput = new FileOutputStream("D:\\project\\ItAcademy\\src\\main\\" +
                "resources\\catSerializable.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput); //преобразует  обьект в байты
        outputStream.writeObject(catSerializable);
        outputStream.close();
        //fileOutput.close();
        System.out.println("Before: " + catSerializable);

        //load десериализация
        FileInputStream fiStream = new FileInputStream("D:\\project\\ItAcademy\\src\\main\\resources\\catSerializable.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();
        System.out.println("After: " + object);
        System.out.println("---------------------------------------------------------------------------------");

        CatExternalize catOne = new CatExternalize("Murzik", "Pssssik", "Siam", 14, 1);
        CatExternalize catTwo = new CatExternalize("Vaska", "Khhh", "Dvorovi", 55, 2);
        System.out.println("Before: \n" + catOne);
        System.out.println(catTwo);
        System.out.println();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\project\\ItAcademy\\" +
                "src\\main\\resources\\catExternal.dat"));
        out.writeObject(catOne);
        out.writeObject(catTwo);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\project\\ItAcademy\\src\\" +
                "main\\resources\\catExternal.dat"));
        catOne = (CatExternalize) in.readObject();
        catTwo = (CatExternalize) in.readObject();
        in.close();

        System.out.println("After: \n" + catOne);
        System.out.println(catTwo);


    }
}
