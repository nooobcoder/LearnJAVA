package Array.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements to be entered:  ");
        int size = new Scanner(System.in).nextInt();

        Solution arrSolution = new Solution(size);
        arrSolution.getIntegers();
        arrSolution.printArray();
        System.out.println("Sorted Array:  " + Arrays.toString(arrSolution.sortArray()));
    }
}
