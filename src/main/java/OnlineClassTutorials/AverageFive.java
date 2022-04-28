package main.java.OnlineClassTutorials;

import java.util.Scanner;

public class AverageFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e = 0.0d;

        System.out.println("Enter five numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        System.out.println("Average of them: " + (a + b + c + d + e) / 5);

        sc.close();
    }
}
