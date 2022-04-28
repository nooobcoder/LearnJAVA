package main.java.ClassesInJava;

public class MainClass {
    public static void main(String[] args) {
        // Private variables inside class car would not be accessible if they are made private.
        Car Hyundai = new Car();
        Car Maruti = new Car();

        Hyundai.setModel("X-Cent");
        Maruti.setModel("Alto");

        // Displaying the model of the car by using a getter method
        System.out.println(Hyundai.getModel());
        System.out.println(Maruti.getModel());
    }
}
