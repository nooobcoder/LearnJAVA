package main.java.Inheritance.DynamicMethodDispatch;

public class SubClass2 extends SuperClass {
    SubClass2() {
        super();
        System.out.println("Inside SubClass2 constructor");
    }

    @Override
    public void displayMessage() {
        System.out.println("Inside SubClass2 function");
    }
}
