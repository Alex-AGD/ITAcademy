package homeTasks.taskMaxNum;

public class MaxNumber {
    public static void main(String[] args) {

        int n;
        int t;
        n = 0;
        do {
            n++;
            t = 3 * n * n - 730 * n;
        }
        while (t < 0);
        System.out.println(n);
    }
}





