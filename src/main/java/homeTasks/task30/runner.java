package main.java.homeTasks.task30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class runner {


    public static void main(String[] args) throws IOException {


        //FileInputStream text1 = new FileInputStream("src/main/resources/example.txt");
         BufferedReader text = new BufferedReader(new FileReader("src/main/resources/example.txt"));
        Scanner sc = new Scanner(text);
        int count = 0;
        int countWord = 0;



                while (sc.hasNextLine()) {
                    String s = sc.nextLine().replaceAll(("[.,:;-]"),"").trim();
                    count++;

                    //String[] st = s.split(" ");



                    System.out.println(s);
                    //System.out.println("Слов: "+ countWord);
                }
            }}






