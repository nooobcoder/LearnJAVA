package OnlineClassTutorials;

import java.util.Scanner;

public class PoundsToKilos {
	public static void main(String[] args) {
		System.out.println("Enter weight in pounds:  ");
		try (Scanner sc = new Scanner(System.in);) {
			double pWeight = sc.nextDouble();
			double pKilos = 0.454 * pWeight;
			System.out.println("Weight in Kilograms:  " + pKilos);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
