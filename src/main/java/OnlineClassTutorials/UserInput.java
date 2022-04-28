package main.java.OnlineClassTutorials;

import java.util.Scanner;

// To calculate the sum of two numbers
public class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter value of a and b");
            int a, b = 0;
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Sum of, " + a + " and " + b + " is,  " +(a + b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
