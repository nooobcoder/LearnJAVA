package Inheritance.DynamicMethodDispatch;

// This is one of the child class that inherits from the parent class in the package

public class SubClass1 extends SuperClass{
    SubClass1()
    {
        super();  // This is not necessary in this case, as the default constructor is called automatically
        System.out.println("Inside SubClass1 constructor");
    }

    @Override
    public void displayMessage() {
        System.out.println("Inside SubClass1 function");
    }
}
