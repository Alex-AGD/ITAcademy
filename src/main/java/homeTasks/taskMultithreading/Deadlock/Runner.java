package main.java.homeTasks.taskMultithreading.Deadlock;

public class Runner {
    public static void main(String[] args) {
        final Friend alphonse = new Friend("Andrew");
        final Friend gaston = new Friend("Vania");

        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
    }
}





