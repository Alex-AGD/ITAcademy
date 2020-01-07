package com.HomeLesson;

public class Runner {
    public static void main(String[] args) {
        //Task 1
        {
            Operations printEven = new Operations();
            printEven.printEven(8);
            System.out.println();
        }
        //Task 2
        {
            Operations numNearTen = new Operations();
            numNearTen.numNearTen(8.5f, 11.45f);
            System.out.println();
        }
        //Task 3

        {
            Operations printMoreZero = new Operations();
            printMoreZero.printMoreZero(2);
            System.out.println();
        }
        //Task 4
        {
            Operations printVarZero = new Operations();
            printVarZero.printVarZero(3, 5);
            System.out.println();
        }
        //Task 5
        {
            Operations printMon = new Operations();
            printMon.printMon(2);
            System.out.println();
        }


    }
}



