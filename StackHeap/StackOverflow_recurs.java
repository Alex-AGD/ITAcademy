package StackHeap;

public class StackOverflow_recurs {
    public static void main(String[] args) {

        int value = calcSum(2, 9);
        System.out.println(value);

    }

    private static int calcSum(int a, int b) {
        int sum = a + b;
        calcSum(1, 1);
        return sum;
    }

}
