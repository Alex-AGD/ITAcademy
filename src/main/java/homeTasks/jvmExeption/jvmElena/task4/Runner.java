package main.java.homeTasks.jvmExeption.jvmElena.task4;

public class Runner {

    public static void main(String[] args) {

        System.out.println("java.lang.StackOverflowError. Use recursive methods. Don’t tune stack size.");

        soeRecursive();
    }

    private static void soeRecursive() {
        soeRecursive();
    }
}
