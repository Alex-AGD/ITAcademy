package main.java.workHome.multithreading;

public class PrinterThread extends Thread {
private String name;

    public PrinterThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        someMethod();

    }

    private void someMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("I'm %s\n", name  + Thread.currentThread().getName() + " i = " + i);


        }
    }

    public void getPriority(int i) {
        System.out.printf("I'm %s\n", name  + Thread.currentThread().getName() + " Приоритет получен!!!");
    }
}

