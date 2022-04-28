package main.java.Futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculatorSingleThread implements ISquareCalculator {
    private final ExecutorService executor;

    public SquareCalculatorSingleThread() {
        executor = Executors.newSingleThreadExecutor();
    }

    @Override
    public Future<Integer> calculate(Integer input) {
        System.out.println("Calculating square for " + input);
        return executor.submit(() -> {
            try {
                Thread.sleep(1000);
                return (int) Math.pow(input, 2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void shutDown() {
        executor.shutdown();
    }
}
