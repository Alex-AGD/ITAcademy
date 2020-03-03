package homeTasks.jvmExeption.heapExept;

import java.util.Arrays;

public class HeapError {
    public static void main(String[] args) {


        int[] arr = new int[1000000000];
        try {
            System.out.print(arr[10000]);
        } catch (OutOfMemoryError e) {
            System.out.println("Хип переполнен" + e);
        } finally {
            System.out.println(Arrays.toString(arr));

        }
    }
}

