package main.java.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] myVar;
        myVar = new int[10]; // Space allocated for 10 integers in the array

        myVar[0] = 45;
        myVar[5] = 62;  // Storing a value of '62' in 6th cell of the array
        myVar[1] = 48;
        System.out.println(myVar[5]);
        System.out.println(myVar[0]);
        System.out.println(myVar[1]);
        System.out.println("\n");

        double[] myDoubleArray = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0};
        for (double acc : myDoubleArray)
            System.out.println(acc);
    }
}
