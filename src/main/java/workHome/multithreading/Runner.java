package main.java.workHome.multithreading;

public class Runner {
    public static void main(String[] args) throws Exception {
        PrinterThread first = new PrinterThread("Thread first ");
        Thread.yield();
        first.start();
        Thread.sleep(2000);
        //first.run();

        PrinterThread second = new PrinterThread("Thread second ");
        second.setPriority(Thread.MAX_PRIORITY);
        second.start();
        Thread.sleep(2000);
        //second.run();


        Runable myRunable = new Runable("Thread myRunable ");
        Thread thread = new Thread(myRunable);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread.join();
        Thread.sleep(2000);

        Runable myRunableTwo = new Runable("Thread myRunableTwo ");
        Thread threadTwo = new Thread(myRunableTwo);

        threadTwo.start();
        Thread.sleep(2000);


        new Runable("Thread Runable static ").run();
        Thread.sleep(3000);// выполняет метод run последовательно без использования Thread


        new Runable.MyThread("Thread static MyThreadOne ").start();
        Thread.sleep(2000);

        new Runable.MyThread("Thread static MyThreadTwo ").start();
        Thread.yield(); //дает вероятность что поток  выполнится раньше
        Thread.sleep(2000);


    }

}

class Runable implements Runnable {
    private String name;

    public Runable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("I'm %s\n", name  + Thread.currentThread().getName());
        }

    }

    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {

                System.out.printf("I'm %s\n", name  + Thread.currentThread().getName() + " i = " + i);
            }
        }}}






