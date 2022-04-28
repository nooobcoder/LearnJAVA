package main.java.Array.Challenge2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
 * <p>
 * -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
 * <p>
 * -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
 * <p>
 * -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
 * <p>
 * -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
 * <p>
 * -Finally, print the minimum element in the array.
 * <p>
 * Tips:
 * -Assume that the user will only enter numbers, never letters
 * -For simplicity, create a Scanner as a static field to help with data input
 */

public class MinimumElement {
    private int count;
    private int[] arr;

    private void readIntegers(int count) {
        this.count = count;
        arr = new int[this.count];

        for (int lim = 0; lim < count; lim++) {
            System.out.println("Enter element #" + (lim + 1));
            arr[lim] = new Scanner(System.in).nextInt();
        }
    }

    private int findMin(int[] minArr) {
        // Sorting the array in ascending order to obtain the minimum element at the first index.
        int temp = 0;

        for (int a = 0; a < count; a++) {
            for (int b = a + 1; b < count; b++) {
                if (minArr[a] > minArr[b]) {
                    temp = minArr[a];
                    minArr[a] = minArr[b];
                    minArr[b] = temp;
                }
            }
        }

        return minArr[0];
    }

    public static void main(String[] args) {
        int size = 0;
        System.out.println("Enter the number of elements to be input:  ");
        size = new Scanner(System.in).nextInt();
        System.out.println();

        MinimumElement minimumElement = new MinimumElement();

        // Passing the number of integers to be input to the appropriate function call.
        minimumElement.readIntegers(size);

        // Calling the findMin() method passing the array returned from the call to the readIntegers() method.
        int minimumValue = minimumElement.findMin(Arrays.copyOf(minimumElement.arr, minimumElement.count));
        System.out.println("Minimum Value in the array:  " + minimumValue + "\n");
    }
}
