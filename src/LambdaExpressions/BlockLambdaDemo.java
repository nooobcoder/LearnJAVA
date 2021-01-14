package LambdaExpressions;

interface NumericFunc {
    long func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        System.out.println("\n\n");
        NumericFunc factorial = (n) -> {
            long result = 1;
            for (int g = 1; g <= n; ++g) {
                result *= g;
            }
            return result;
        };

        System.out.println("Factorial of 5 is:  " + factorial.func(5));
        System.out.println("Factorial of 12 is:  " + factorial.func(12));
        System.out.println("\n\n");
    }
}
