package WrapperClasses;

public class AutoboxingUnboxingReboxing {
    public static void main(String[] args) {
        Integer iOb1, iOb2;
        int i;

        iOb1 = 100;
        System.out.println("Original Value of iOb1: " + iOb1);

        ++iOb1;
        System.out.println("After ++iOb1: " + iOb1);

        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        i = iOb1 + (iOb1 / 3);
        System.out.println("i after expression: " + i);

        iOb1 = 100;
        Double dOb1 = 98.6 + iOb1;
        System.out.println("dOb1 after expression: " + dOb1);
    }
}
