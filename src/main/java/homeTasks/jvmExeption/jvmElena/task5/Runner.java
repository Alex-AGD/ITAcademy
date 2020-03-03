package homeTasks.jvmExeption.jvmElena.task5;

public class Runner {

    public static void main(String[] args) {

        System.out.println("java.lang.StackOverflowError. Do not use recursive methods. Don’t tune stack size.");

        new Runner().soeNoRecursive();

    }

    private void soeNoRecursive() {
        new Runner().soeNoRecursive();
    }
}
