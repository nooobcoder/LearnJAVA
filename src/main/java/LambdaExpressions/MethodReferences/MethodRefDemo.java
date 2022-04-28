package main.java.LambdaExpressions.MethodReferences;

// Demonstrate a method reference for a static method

// A functional interface for string operations
interface StringFunc {
    String func(String n);
}

// This method defines a static method called strReverse
class MyStringOps {
    // A static method, that reverses a string
    static String strReverse(String s) {
        String result = "";
        for (int h = s.length() - 1; h >= 0; --h) {
            result += s.charAt(h);
        }
        return result;
    }
}

public class MethodRefDemo {
    // This method has a functional interface as the type of it's first parameter.
    // Thus it can be passed any instance of that interface, including a method
    // interface.
    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String str = "Lambdas add power to Java";
        String outStr = "";

        // Here a method reference to strReverse is passed to stringOp
        outStr = stringOp(MyStringOps::strReverse, str);

        System.out.println("Original String:  " + str);
        System.out.println("Reversed String:  " + outStr);
    }
}
