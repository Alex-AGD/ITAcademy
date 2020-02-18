package main.java.workHome.multithreading;

public class Runner {
    public static void main(String[] args) throws Exception {
        PrinterThread first = new PrinterThread();
        first.start();
        Thread.sleep(1000);
        //first.run();

        PrinterThread second = new PrinterThread();
        second.start();
        Thread.sleep(2000);
        //second.run();


        Runable myRunable = new Runable();
        Thread thread = new Thread(myRunable);
        thread.start();
        Thread.sleep(3000);

        Runable myRunableTwo = new Runable();
        Thread threadTwo = new Thread(myRunableTwo);
        threadTwo.start();
        Thread.sleep(3000);


        new Runable().run();
        Thread.sleep(3000);// выполняет метод run последовательно без использования Thread


        new Runable.MyThread().start();
        Thread.sleep(3000);
        new Runable.MyThread().start();
        Thread.sleep(3000);


    }

}

class Runable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread name " + Thread.currentThread().getName());
        }

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread name " + Thread.currentThread().getName() + " i = " + i);
            }
        }
    }
}




