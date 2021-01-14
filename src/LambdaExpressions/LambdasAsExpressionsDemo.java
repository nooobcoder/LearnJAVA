package LambdaExpressions;

interface StringFunctionalInterface {
    String func(String n);
}

public class LambdasAsExpressionsDemo {

    /*
     * This method has a functional interface as the type of it's first parameter.
     * Thus, it can be passed as a reference to any instance of that interface
     * including the instance created by a lambda expresison.
     */
    static String stringOp(StringFunctionalInterface sfi, String s) {
        return sfi.func(s);
    }

    // This function is used in the main() to be used as function reference.
    static String getReverse(String s) {
        String result = "";
        for (int y = s.length() - 1; y >= 0; --y) {
            result += s.charAt(y);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        String inStr = "Lambdas add power to Java";
        String outStr = "";

        System.out.println("The input string ->  " + inStr);

        // Here, a simple expression that uppercases a string is passed to stringOp()
        outStr = stringOp((str) -> {
            String result = "";
            for (int h = 0; h < str.length(); ++h) {
                if (str.charAt(h) != ' ')
                    result += str.charAt(h);
            }
            return result;
        }, inStr);

        System.out.println("Output obtained by removing spaces ->  " + outStr);
        System.out.println("\n");

        // Ofcourse, it is also possible to pass a StringFunctionalInterface instance
        // created by
        // an earlier lambda expression. For example, after this declaratioin executes,
        // reverse refers to an instance of StringFunctionalInterface.

        StringFunctionalInterface reverseStr = (str) -> {
            String result = "";
            int i = str.length() - 1;

            for (; i >= 0; --i) {
                result += str.charAt(i);
            }
            return result;
        };

        outStr = stringOp(LambdasAsExpressionsDemo::getReverse, inStr); // This is an example of Method Reference, see
                                                                        // doucmentation or code example to get clear
                                                                        // image. You can also refer to the above
                                                                        // snippet to understand what is the difference.

        // Now, reverse can be passed as the first parameter to stringOp since it refers
        // to a StringFunctionalInterface object
        System.out.println("Output obtained by reversing the string -> " + stringOp(reverseStr, outStr));
        // System.out.println("Output obtained by reversing the string -> " + outStr);
        System.out.println("\n");
    }
}
