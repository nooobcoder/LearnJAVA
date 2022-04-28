package main.java.Inheritance.DynamicMethodDispatch;

// Dynamic method dispatch technique is also known as virtual functions in C++

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(); // Parent class constructor

        superClass.displayMessage();
        System.out.println();

        superClass = new SubClass1(); // Parent class object referenced to a sub class
        /*
         * Below function call is surprising as it would call the function from the sub class. This is because
         * of the new reference of the object with the base class. This is an example of run-time polymorphism in JAVA
         * and also known as late or dynamic binding in C++
         */
        superClass.displayMessage();
        System.out.println();

        superClass = new SubClass2(); // Object now referencing to it's another child
        superClass.displayMessage();
        System.out.println();

        SubClass1 subClass1 = new SubClass3();
        subClass1.displayMessage();
    }
}
