package main.java.homeTasks.jvmExeption.jvmElena.task1;

public class Runner {

    public static void main(String[] args) {
        System.out.println("java.lang.OutOfMemoryError: Java heap space. You can use different data structures. Do not tune heap size.");

        oomeBigArray();
    }


    private static void oomeBigArray() {
        int[] bigArray = new int[Integer.MAX_VALUE];
    }
}
