package Exceptions;

// Demonstrate the throw keyword

public class ThrowKeyword {
    static void demoproc() {
        try {
            throw new Exception("demo");
        } catch (Exception e) {
            System.out.println("Caught inside demoproc: "+e.getMessage());
            // throw e;  // rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (Exception e2) {
            System.out.println("Recaught: " + e2);
        }
    }
}
