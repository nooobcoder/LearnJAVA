package Exceptions;

public class ThrowsKeyword {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("Illegal Access Exception");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
