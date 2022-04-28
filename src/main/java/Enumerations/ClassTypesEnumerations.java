package main.java.Enumerations;

// Use an enum constructor, instance variable, and method.
enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8),Kashmiri();

    private final int price;

    // Construction of the enumeration (CONSTRUCTOR IS REQUIRED ALWAYS, IF WE WANT TO ASSIGN CONSTANT VALUES TO ENUMERATED OBJECTS)
    Apple3(int p) {
        price = p;
    }

    // Just an overloaded constructor
    Apple3() {
        this.price = -1;
    }

    public int getPrice() {
        return price;
    }
}

public class ClassTypesEnumerations {
    public static void main(String[] args) {
        // Display price of winesap
        System.out.println("Wine sap costs: " + Apple3.Winesap.getPrice());

        System.out.println("All Apple's Prices\n");

        for (Apple3 a : Apple3.values()) {
            System.out.println(a + " costs " + a.getPrice());
        }
    }
}
