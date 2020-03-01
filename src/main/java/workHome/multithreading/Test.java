package main.java.workHome.multithreading;

import main.java.workHome.multithreading.sample1.PrinterThread;

public class Test implements Cloneable {
    public static void main(String[] args) {

        Thread thread = new Thread(new PrinterThread("Второй метод вызова"));
        thread.start();

         

        Thread thread1 = new Thread(new Runnable() {   //fitch anonym class передаем obj anonym class который реализ implements interfaces
            @Override
            public void run() {
                System.out.println( getClass().getName() + " hello" );
            }
        });
        thread1.setDaemon(true);
        thread1.start();

    }
}
