package org.example.javatestprogramming;

import java.util.concurrent.Future;

public interface ISquareCalculator {
    Future<Integer> calculate(Integer input);

    void shutDown();
}
