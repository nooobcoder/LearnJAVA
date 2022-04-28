package main.java.Array.Challenge3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * -Write a method called reverse() with an int array as a parameter.
 * <p>
 * -The method should not return any value. In other words, the method is allowed to modify the array parameter.
 * <p>
 * -In main() test the reverse() method and print the array both reversed and non-reversed.
 * <p>
 * -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
 * <p>
 * -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */
public class ReverseArray {
    static int[] dupArray;

    private static void reverse(int[] arr) {
        int size = arr.length;
        dupArray = new int[size];
        for (int i = size - 1; i >= 0; i--)
            dupArray[size - i - 1] = arr[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:  ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int arrIndex = 0; arrIndex < size; arrIndex++)
            arr[arrIndex] = scanner.nextInt();

        reverse(arr);
        System.out.println("Original main.java.Array:  " + Arrays.toString(arr));
        System.out.println("Reversed main.java.Array:  " + Arrays.toString(dupArray));
    }
}
