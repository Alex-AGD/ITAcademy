package main.java.homeTasks.taskIO.slidesExmp;

import jdk.internal.util.xml.impl.ReaderUTF8;
import main.java.workHome.stream.soundStream.Sound;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class RunnerSlides {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {

/*        { while (true) {
                int x = System.in.read(); //read byte
                System.out.println(x); }}*/

/*        { InputStreamReader reader = new InputStreamReader(System.in);
            while (true) {
                int x = reader.read();
                System.out.println(x); }}*/


/*        { BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            String s = reader1.readLine();
            System.out.println("Пользователь ввел следующий текст: ");
            System.out.println(s);
            reader1.close(); }*/

/*        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("src/main" +
                "/resources/InputStreamTxt.txt"), "UTF-8"));
        String c = reader2.readLine();
        System.out.println(c);
        reader2.close();*/

        BufferedReader reader4 = new BufferedReader(new ReaderUTF8(new FileInputStream("src/main" +
                "/resources/InputStreamTxt.txt")));
        String q = reader4.readLine();
        System.out.println(q);
        reader4.close();


        BufferedReader reader3 = new BufferedReader(new FileReader("src/main/resources/InputStreamTxt2.dat"));
        String x = reader3.readLine();
        System.out.println(x);
        reader3.close();

        /*        Scanner sc = new Scanner(System.in);
         *//*        System.out.println("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number);*//*

         *//*        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        System.out.println("Спасибо! Вы ввели строку " + string);*//*

        System.out.println("Земля плоская: ");
        //boolean bool = sc.nextBoolean();
        if (sc.hasNextBoolean()) {
            boolean bool = sc.nextBoolean();
            System.out.println("Да земля плоская" + bool);
        } else {
            System.out.println("Да земля круглая");
        }


        Scanner sa = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (sc.hasNextInt()) {
            int number = sa.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте ещё раз");*/

/*
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }*/

/*
        String dataPath = "D:\\project\\ItAcademy\\src\\main\\resources\\scanTxt.txt";
        Scanner s = null;
        try {s = new Scanner(new BufferedReader(new FileReader(dataPath)));
        //c= new Scanner(new File(dataPath));
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }finally{
        if (s !=null){
            s.close();
        }
    }
*/

/*
        String input = "1 fish 2 fish red fish blue fish";
        Scanner k = new Scanner(input).useDelimiter("\\s*fish\\s");
        System.out.println(k.nextInt());
        System.out.println(k.nextInt());
        System.out.println(k.next());
        System.out.println(k.next());*/


/*        Console o = System.console();
        if(o==null){
            System.err.println("No console.");
            System.exit(1);
        }
        String s = o.readLine();
        char[] pass = o.readPassword();*/

        Sound.playSound("src/main/resources/CampuchaMan.wav").join();
    }
}


