package main.java.OnlineClassTutorials;

import java.util.Scanner;

public class GreatestThree {
    //Write a program to find greatest of 3 numbers.
    public static void main(String[] args) {
        byte a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        a = ob.nextByte();
        b = ob.nextByte();
        c = ob.nextByte();
        if (a > b & a > c)
            System.out.println("a is greatest");
        else if (b > c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");
    }
}
