package main.java.Inheritance.Interfaces;

/*Below interface has a function that would not be implemented by implementing classes
Hence, we need to implement a default function as a function in an interface without a definition in the
implementing class would raise an error*/

interface MyIf {
    // This is a normal 'interface' method declaration
    // It does not define a default implementation
    int getNumber();

    // This is a default method. Notice that it provides a default implementation
    default String getString() {
        return "Default String";
    }
}

// Implement MyIf interface.
class MyIFImp implements MyIf {
    // Only getNumber() defined by MyIf needs to be implemented.
    // getString() can be allowed to default

    @Override
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIf {
    // Here, implementation for both getNumber() and getString() are provided
    @Override
    public int getNumber() {
        return 50;
    }

    @Override
    public String getString() {
        return "This is a different string.";
    }
}

public class DefaultInterfaceDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        // Can call getNumber() because it is explicitly implemented by MyIFImp
        System.out.println(obj.getNumber());
        // Can also call getstring() because of default implementation.
        System.out.println(obj.getString());


        MyIFImp2 obj2 = new MyIFImp2();
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
