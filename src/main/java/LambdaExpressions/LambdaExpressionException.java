package main.java.LambdaExpressions;

interface ArrayAverage {
    double getComputedAverage(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("The array is empty!");
    }
}

public class LambdaExpressionException {
    public static void main(String[] args) {
        double values[] = { 1.0, 2.0, 3.0, 4.0 };

        // This block lambda computes the average of the elements contained by the
        // array.
        ArrayAverage arrayExp = (n) -> {
            double sum = 0.0d;

            if (n.length == 0)
                throw new EmptyArrayException();
            else {
                for (double elem : n) {
                    sum += elem;
                }
                return sum / n.length;
            }
        };

        try {
            System.out.println("The average is ->  " + arrayExp.getComputedAverage(values));
            System.out.println("The average is ->  " + arrayExp.getComputedAverage(new double[0])); // This should throw
                                                                                                    // an error.
        } catch (EmptyArrayException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
