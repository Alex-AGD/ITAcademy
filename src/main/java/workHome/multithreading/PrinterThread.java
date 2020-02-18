package main.java.workHome.multithreading;

public class PrinterThread extends Thread {


    @Override
    public void run() {
        someMethod();

    }

    private void someMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Theard name " + Thread.currentThread().getName() + " i = " + i);


        }
    }
}

