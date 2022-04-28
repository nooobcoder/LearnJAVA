package main.java.Composition;

public class MAIN {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch", "Acer", 27, new Resolution(1600, 900));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer personalComputer = new PersonalComputer(theCase, monitor, motherboard);

        personalComputer.powerUp();
    }
}
