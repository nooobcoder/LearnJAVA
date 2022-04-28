package main.java.OnlineClassTutorials;

//Write a program to check whether a number is +ve,-ve and zero.

import java.util.Scanner;

public class NumberNegativePositive {
    public static void main(String[] args) {
        byte a;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = ob.nextByte();
        if (a > 0)
            System.out.println("a is positive");
        else if (a < 0)
            System.out.println("a is negative");
        else
            System.out.println("a is zero");
    }
}
