package Generics;

class NonGenericClass {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; ++i)
            if (x.equals(y[i]))
                return true;
        return false;
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Integer nums[] = { 1, 2, 3, 4, 5 };
        if (NonGenericClass.isIn(2, nums)) {
            System.out.println("2 is in nums");
        }
        if (!NonGenericClass.isIn(7, nums)) {
            System.out.println("7 is not in nums");
        }
        System.out.println();

        // Use isIn() in Strings.
        String str[] = { "one", "two", "three", "four", "five" };
        if (NonGenericClass.isIn("two", str))
            System.out.println("two is in str");
        if (!NonGenericClass.isIn("seven", str))
            System.out.println("seven is not in str");
    }
}
