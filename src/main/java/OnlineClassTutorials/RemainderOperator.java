package main.java.OnlineClassTutorials;

public class RemainderOperator {
    public static void main(String[] args) {
        // The remainder operator in Java works a bit strange, see the below examples
        int b = 5;
        int a = 23;
        System.out.println("a % b -> " + a % b);
        System.out.println("b % a -> " + b % a);

        // The returned result always obeys the same symbol (+ve or -ve) as that of the numerator.

        System.out.println("-33 % 5 -> " + (-33 % 5));
        System.out.println("-33 % -5 -> " + (-33 % -5));


        System.out.println("-3 % 5 -> " + (-3 % 5)); // If numerator is small, numerator is returned
        System.out.println("-5 % -12-> " + (-5 % -12));
//        Although Java has a remainder operator for int and long types, it has no modulus function or operator. I.e., -12 % 10 = -2 whereas -12 mod 10 = 8. If % operator returns a negative value for n % m, then (n % m) + m will give you n mod m.
        System.out.println(0 % 1);
    }
}
