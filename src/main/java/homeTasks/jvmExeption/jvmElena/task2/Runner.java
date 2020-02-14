package homeTasks.jvmExeption.jvmElena.task2;

public class Runner {

    public static void main(String[] args) {

        System.out.println("java.lang.OutOfMemoryError: Java heap space. Create big objects continuously and make them stay in memory. Do not use arrays or collections.");

        oomeBigObject();
    }

    private static void oomeBigObject() {
        String str = "String";
        while (true) {
            str += str;
        }
    }
}
