package main.java.OOPChallenge;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe", "Sausage & Bacon", "White", 300);
        super.addHamburger1("Chips", 30);
        super.addHamburger2("Drinks", 60);
    }

    // Preventing the user from adding anything extras with a deluxe burger

    @Override
    public void addHamburger1(String name, double price) {
        System.out.println("Additional items cannot be added to a deluxe burger");
    }

    @Override
    public void addHamburger2(String name, double price) {
        System.out.println("Additional items cannot be added to a deluxe burger");
    }

    @Override
    public void addHamburger3(String name, double price) {
        System.out.println("Additional items cannot be added to a deluxe burger");
    }

    @Override
    public void addHamburger4(String name, double price) {
        System.out.println("Additional items cannot be added to a deluxe burger");
    }
}
