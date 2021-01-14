package LambdaExpressions;

interface SomeFunc<V> {
    V func(V o);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        System.out.println();
        // Use a string based function when data input is a string.
        SomeFunc<String> lambdaString = (String s) -> {
            String revStr = "";
            for (int y = s.length() - 1; y >= 0; --y)
                revStr += s.charAt(y);
            return revStr;
        };

        SomeFunc<Long> lambdaInteger = (Long num) -> {
            long resultFactorial = 1l;
            for (int a = 1; a <= num; ++a) {
                resultFactorial *= a;
            }
            return resultFactorial;
        };

        System.out.println("Liril -> " + lambdaString.func("Liril"));
        System.out.println("Malayalam -> " + lambdaString.func("Malayalam"));
        System.out.println();
        System.out.println("Factorial of 2 -> " + lambdaInteger.func(3l));
        System.out.println("Factorial of 7 -> " + lambdaInteger.func(7l));
        System.out.println();
    }
}
