package Exceptions;

// Demonstrate the throw keyword

public class ThrowKeyword {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc: "+e.getMessage());
            throw e;  // rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e2) {
            System.out.println("Recaught: " + e2);
        }
    }
}
