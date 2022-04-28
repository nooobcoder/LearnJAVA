package main.java.Exceptions;
// Handle an exception and move on

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            try {
                b = rand.nextInt();
                c = rand.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.err.println("Exception:  " + e);
                a = 0; // set a to zero and continue
            } finally {
                System.out.println("a:  " + a);
            }
        }
    }
}
