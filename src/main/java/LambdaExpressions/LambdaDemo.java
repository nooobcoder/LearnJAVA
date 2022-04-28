package main.java.LambdaExpressions;

// Demonstrate a simple lambda expression
interface LFunctionalInterface {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        LFunctionalInterface o; // declares an interface reference.
        /*
         * Here the lambda expression is simply a constant expression. When it is
         * assigned to 'o', a class instance is constructed in which the lambda
         * expression implements the getValue() method in LFunctionalInterface
         */
        o = () -> 12.345;
        /*
         * Call getValue() which is provided by the previously assigned lambda
         * expression.
         */
        System.out.println("A fixed value:  " + o.getValue());

        o = () -> Math.random() * 100;
        System.out.println("A random value:  " + (Math.round(o.getValue()) + 1));
        System.out.println("Another random value:  " + (Math.round(o.getValue()) + 1));

        // o = () -> "This should fail! Type Mismatch"; // ! Error
    }
}
