package main.java.Array.Challenge;

import java.util.Scanner;

/**
 * Create a program using arrays that sorts a list of integers in descending order.
 * Descending order is highest value to lowest.
 * In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
 * ultimately have an array with 106,81,26, 15, 5 in it.
 * Set up the program so that the numbers to sort are read in from the keyboard.
 * Implement the following methods - getIntegers, printArray, and sortIntegers
 * getIntegers returns an array of entered integers from keyboard
 * printArray prints out the contents of the array
 * and sortIntegers should sort the array and return a new array containing the sorted numbers
 * you will have to figure out how to copy the array elements from the passed array into a new
 * array and sort them and return the new sorted array.
 */

public class Solution {
    private final int[] arrOriginal;
    private final int size;

    Solution(int size) {
        // Stores the size of the array as input by the user
        this.size = size;
        arrOriginal = new int[this.size];
    }

    public void getIntegers() {
        for (int a = 0; a < size; a++) {
            System.out.print("Enter element #1:  ");
            arrOriginal[a] = new Scanner(System.in).nextInt();
        }
    }

    public void printArray() {
        for (int h : arrOriginal)
            System.out.print(h + ", ");
        System.out.println();
    }

    public int[] sortArray() {
        // Copying the original array into a dummy array
        int[] arr = arrOriginal;

        int temp = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length - x - 1; ++y) {
                if (arr[x] < arr[x + 1]) {
                    temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        // Returning the sorted array
        return arr;
    }
}
