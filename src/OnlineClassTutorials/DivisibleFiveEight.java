package OnlineClassTutorials;

//Write a program to check whether a number is divisible by 5 as well as 8.

import java.util.Scanner;

public class DivisibleFiveEight {
    public static void main(String[] args) {
        byte a;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = ob.nextByte();
        if (a % 5 == 0 & a % 8 == 0)
            System.out.println("a is divisible by 5 as well as 8");
        else
            System.out.println("a is not divisible by 5 as well as 8");

    }
}
