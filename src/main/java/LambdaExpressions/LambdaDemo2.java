package main.java.LambdaExpressions;

// A functional interface
interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = num -> num % 2 == 0; // ! When there is only one parameter, () are not necessary
        if (isEven.test(10))
            System.out.println("10 is even");
        if (!isEven.test(9))
            System.out.println("9 is odd");

        NumericTest nonNeg = (n) -> n >= 0;

        if (nonNeg.test(1))
            System.out.println("1 is positive");
        if (!nonNeg.test(-1))
            System.out.println("-1 is negative");
    }
}
