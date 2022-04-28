package main.java.Array;

import java.util.Arrays;

public class ResizingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int u = 0; u < 5; ++u)
            arr[u] = u + 1;
        System.out.println(Arrays.toString(arr));

        arr = new int[8];
        // After resizing, the old data are not retained in the array
        for (int u = 0; u < 8; ++u)
            arr[u] = u + 1;
        System.out.println(Arrays.toString(arr));
    }
}
