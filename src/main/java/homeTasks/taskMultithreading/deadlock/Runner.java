package homeTasks.taskMultithreading.deadlock;

public class Runner {
    public static void main(String[] args) {
        final Friend alphonse = new Friend("Andrew");
        final Friend gaston = new Friend("Vania");

        new Thread(() -> alphonse.bow(gaston)).start();
        new Thread(() -> gaston.bow(alphonse)).start();
    }
}





