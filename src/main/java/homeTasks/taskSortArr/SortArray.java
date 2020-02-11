package main.java.homeTasks.taskSortArr;

public class SortArray {

    public static void main(String[] args) {

        int[] array = {2, 7, 4, 6, 9};

        System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

        System.out.println("Sorted array:");
        for (int arr : array) {
            System.out.println(arr);

        }
    }
}