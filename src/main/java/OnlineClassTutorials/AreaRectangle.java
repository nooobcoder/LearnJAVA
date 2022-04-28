package main.java.OnlineClassTutorials;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) { // Trying with resources.
            double l, b;
            System.out.println("Enter length and breadth of the triangle:  ");
            l = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + (l * b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
