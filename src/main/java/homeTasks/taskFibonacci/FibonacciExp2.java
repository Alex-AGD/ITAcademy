package homeTasks.taskFibonacci;

public class FibonacciExp2 {

    {
        int a = 1;
        int b = 1;
        int fib;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 20; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");


        }
    }

    public void test(int fib) {

    }
}

