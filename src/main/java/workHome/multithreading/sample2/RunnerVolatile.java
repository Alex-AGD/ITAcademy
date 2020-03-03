package workHome.multithreading.sample2;

public class RunnerVolatile {
    volatile static int i = 0; // volatile не кеширует,а пишет непсоредственно в память

    public static void main(String[] args) {
        new MyThreadWrite().start();
        new MyThreadRead().start();


    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("increment to " + (++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();


                }

            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("new value is " + i);
                    localVar = i;
                }
            }
        }
    }
}
