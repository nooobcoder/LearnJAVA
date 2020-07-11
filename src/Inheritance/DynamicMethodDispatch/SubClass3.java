package Inheritance.DynamicMethodDispatch;

public class SubClass3 extends SubClass1 {
    SubClass3() {
        super();
        System.out.println("Inside SubClass3 constructor");
    }

    @Override
    public void displayMessage() {
        System.out.println("Inside SubClass3 function");
    }
}
