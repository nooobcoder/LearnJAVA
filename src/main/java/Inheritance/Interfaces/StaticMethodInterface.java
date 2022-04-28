package main.java.Inheritance.Interfaces;

interface MyInterface {
    // This is a normal interface method declaration
    // It does not define a default implementation
    int getNumber();

    // This is a default method. Notice that it provides a default implementation
    default String getString() {
        return "Default String";
    }

    // This is a static interface method
    // static methods in interface should have a body
    static int getDefaultNumber() {
        return 0;
    }
}

public class StaticMethodInterface {
    public static void main(String[] args) {
        // Calling the static method of the interface
        int defNumber = MyInterface.getDefaultNumber();
        System.out.println("Value Returned:  " + defNumber);
    }
}
