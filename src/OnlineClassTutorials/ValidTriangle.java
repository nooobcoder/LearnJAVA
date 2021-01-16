package OnlineClassTutorials;

/*Write a program that reads three edges for a triangle and computes the perimeter
if the input is valid.Otherwise, display that the input is invalid.
The input is valid if the sum of every pair of two edges is
greater than the remaining edge*/

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        byte a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextByte();
        b = sc.nextByte();
        c = sc.nextByte();
        if (a + b <= c || b + c <= a || a + c <= b)
            System.out.println("Triangle is invalid");
        else {
            System.out.println("Triangle is valid");
            System.out.println("Perimeter: " + (a + b + c));
        }
    }
}
