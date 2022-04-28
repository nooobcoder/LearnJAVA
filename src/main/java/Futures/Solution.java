package main.java.Futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Solution {

    public static void main(String[] args) {
        /*
        SquareCalculatorSingleThread obj = new SquareCalculatorSingleThread();
        SquareCalculatorSingleThread obj2 = new SquareCalculatorSingleThread();
        */
        SquareCalculatorMultiThread obj = new SquareCalculatorMultiThread(2);
        Future<Integer> res = obj.calculate(23);
        Future<Integer> res2 = obj.calculate(12);

        try {
            while (!(res.isDone() && res.isDone())) {
                System.out.printf("Future is %s and Future2 is %s %n",
                        res.isDone() ? "done" : "not done",
                        res2.isDone() ? "done" : "not done");
                Thread.sleep(300);
            }

//            boolean cancelled = res.cancel(true);

            Integer result = res.get();
            Integer result2 = res2.get();
            System.out.println(result + " and " + result2);
        } catch (InterruptedException | ExecutionException | CancellationException e) {
            e.getStackTrace();
        } finally {
            obj.shutDown();
//            obj2.shutDown();
        }
    }
}
