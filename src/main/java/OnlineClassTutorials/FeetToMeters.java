package main.java.OnlineClassTutorials;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value (in feet(s)): ");
        double f = sc.nextDouble();
        System.out.println("IN METERS: " + 0.305 * f);
        sc.close();
    }
}
