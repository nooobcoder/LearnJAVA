package OnlineClassTutorials;

import java.util.Scanner;
enum value{
    First(1);
    value(int i) {
    }
};
public class ShippingPricing {
    public static void main(String[] args) {
        double price = 0.0d;
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();

        if (weight > 0 && weight <= 1) {
            price = 3.5d;
        } else if (weight > 1 && weight <= 3) {
            price = 5.5d;
        } else if (weight > 3 && weight <= 10) {
            price = 8.5d;
        } else if (weight > 10 && weight <= 20) {
            price = 10.5d;
        } else {
            System.out.println("Cnnot be shipped");
        }

        if (price != 0)
            System.out.println(price * weight);
    }
}
