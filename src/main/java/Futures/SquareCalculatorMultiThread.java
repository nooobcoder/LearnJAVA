package org.example.javatestprogramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculatorMultiThread implements ISquareCalculator {
    private final ExecutorService executor;

    public SquareCalculatorMultiThread(int threads) {
        executor = Executors.newFixedThreadPool(threads);
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
