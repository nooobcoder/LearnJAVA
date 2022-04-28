package main.java.LambdaExpressions.MethodReferences.TestCodeForMethodReference;

interface TestFunctionalInterface {
    String myFunc(String str);
}

public class TrialReference {
    static String getReverse(String s) {
        String result = "";
        for (int y = s.length() - 1; y >= 0; --y) {
            result += s.charAt(y);
        }
        return result;
    }

    String getReturnedString(TestFunctionalInterface tfi, String str) {
        return tfi.myFunc(str);
    }

    public static void main(String[] args) {
        String s = "Hello World lambdas are fun";
        String outStr = "";

        TrialReference obj = new TrialReference();
        outStr = obj.getReturnedString(TrialReference::getReverse, s);
        System.out.println("Original String:  " + s);
        System.out.println("Reversed String:  " + outStr);
    }
}
