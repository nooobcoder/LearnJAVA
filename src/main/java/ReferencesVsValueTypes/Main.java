package main.java.ReferencesVsValueTypes;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue:  " + myIntValue + "\n" +
                "anotherIntValue:  " + anotherIntValue + "\n");

        anotherIntValue++;
        System.out.println("myIntValue:  " + myIntValue + "\n" +
                "anotherIntValue:  " + anotherIntValue + "\n");  // Observe the independence of the values held

        // Reference data type. An array is of reference type
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        // Observe how the second array is a reference to the first array. It is similar to pointers as in C++
        // Printing out the arrays
        System.out.println("myIntArray:  " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray:  " + Arrays.toString(anotherIntArray));

        // Making a change to an array
        anotherIntArray[0] = 1;
        System.out.println("After Change, myIntArray:  " + Arrays.toString(myIntArray));
        System.out.println("After Change, anotherIntArray:  " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{5, 6, 7, 8, 9};
        System.out.println("\nAfter Change, myIntArray:  " + Arrays.toString(myIntArray));
        System.out.println("After Change, anotherIntArray:  " + Arrays.toString(anotherIntArray) + "\n");


        // Observe that how arrays can be modified. Arrays can be dangerous sometimes
        modifyArray(myIntArray);
        System.out.println("After Change, myIntArray:  " + Arrays.toString(myIntArray));
        System.out.println("After Change, anotherIntArray:  " + Arrays.toString(anotherIntArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        System.out.println("\nmodifyArray() -> array:  " + Arrays.toString(array));

        // The array now points to a different memory location, as it has been initialized by the 'new' operator
        // Any future modifications would not affect the older arrays in the main method
        array = new int[]{1, 2, 3, 4, 5};
        System.out.println("modifyArray() -> array after 'new':  " + Arrays.toString(array) + "\n");
    }
}
