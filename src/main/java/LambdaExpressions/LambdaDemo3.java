package main.java.LambdaExpressions;

interface NumericTest3 {
    boolean testFactor(int n, int d); // Check whether first is a factor of the second.
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest3 lambdaObj = (n, d) -> (n % d) == 0;

        if (lambdaObj.testFactor(10, 2))
            System.out.println("2 is a factor of 10.");

        if (!lambdaObj.testFactor(10, 3))
            System.out.println("3 is not a factor of 10.");
    }
}
