package Exceptions;

public class Exc1 {
    public static void main(String[] args) {
        int d, a;

        try {
            // monitor this block of code
            a = 0;
            d = 42 / a;
            System.out.println("This would not be printed");
        } catch (Exception e) { // e is an object of the Exception class
            System.err.println("Division by zero error.");
        } finally {
            System.out.println("After catch statement");
        }
    }
}
