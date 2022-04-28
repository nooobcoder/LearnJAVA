package main.java.LambdaExpressions.MethodReferences.TestCodeForMethodReference;

// Creating a functional interface below
interface ReverseString {
    String reverser(String s);
}

class ReferencerClass {
    static String getReversedString(String str) {
        StringBuilder result = new StringBuilder();
        for (int h = str.length() - 1; h >= 0; --h) {
            result.append(str.charAt(h));
        }
        return result.toString();
    }

    static String interfaceMethodReferencer(ReverseString rs, String str) {
        return rs.reverser(str);
    }
}

public class MethodReferenceExample2 extends ReferencerClass {
    public static void main(String[] args) {
        String inStr = "Lambdas are the beauty of Java";
        String outStr = ""; // This shall contain the reversed string

        outStr = ReferencerClass.interfaceMethodReferencer(ReferencerClass::getReversedString, inStr);
        System.out.println("Original String:  " + inStr);
        System.out.println("Reversed String: " + outStr);
    }
}
