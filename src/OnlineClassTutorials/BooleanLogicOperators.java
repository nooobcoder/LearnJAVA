package OnlineClassTutorials;

public class BooleanLogicOperators {
    static int greater() {
        int a = 12, b = 56, c;
        c = a > b ? a : b;
        return c;
    }

    static void bitLRShift() {
//        The>> operator is a signed right shift operator and >>> is an unsigned right shift operator.
        byte x = -10;
        System.out.println(x << 2);
        System.out.println(x >> 2); // 10 / 2*2 -1 = -3 [Add -1 if not completely divisible] [ONLY IN CASE OF RIGHT SHIFT OPERATOR]
    }

    public static void main(String[] args) {
        System.out.println("Greater of a and b is ");
//        System.out.println(greater());

//        short a = 10, b = 10, c = 0;
//        c = a + b; // '+' operator does work with 'int' data types only. This is an error


        int a = 6, b = 7;
        boolean c = false;
        c = ++a == b || b++ >= 8; // b++>=8 is not executed due to being short circuited
        System.out.println(c + " " + b);

        System.out.println(2 > 1 || 4 > 3 ? false : true);

        byte b2=14;
        System.out.println(b2>>3);
    }
}
