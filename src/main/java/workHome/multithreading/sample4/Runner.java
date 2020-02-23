package main.java.workHome.multithreading.sample4;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();//singleThread внутри Executor всегда выполняется 1 Thread
        try {
            Future<BigInteger> future = service.submit(new Calculator(5));
            BigInteger result = null;
            try {
                result = future.get();
                System.out.println("Result = " + result);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e);
            }
        } finally {
            service.shutdownNow();
        }
    }
}
