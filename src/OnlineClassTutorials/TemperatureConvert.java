package OnlineClassTutorials;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0d;
        System.out.println("Enter temperature in Celsius:  ");
        celsius = scanner.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;
        System.out.println("Temperature in Fahrenheit:  " + fahrenheit);

        scanner.close();
    }
}