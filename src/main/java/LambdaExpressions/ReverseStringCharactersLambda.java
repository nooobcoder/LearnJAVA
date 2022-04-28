package main.java.LambdaExpressions;

interface ReverseStringCharacters {
    String reverseString(String s);
}

public class ReverseStringCharactersLambda {
    public static void main(String[] args) {

        System.out.println("\n");
        ReverseStringCharacters stringReverse = (String inpStr) -> {
            String revStr = "";
            for (int h = inpStr.length() - 1; h >= 0; --h) {
                revStr += String.valueOf(inpStr.charAt(h)).toLowerCase();
            }
            return revStr;
        };

        System.out.println("Ankur -> " + stringReverse.reverseString("Ankur"));
        System.out.println("Expression -> " + stringReverse.reverseString("Expression"));
        System.out.println("Lambda -> " + stringReverse.reverseString("Lambda"));
        System.out.println("\n");
    }
}
