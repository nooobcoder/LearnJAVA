package Inheritance.Interfaces;

interface Callback {
    void callback(int parent);
}

class Client implements Callback {
    @Override
    public void callback(int parent) {
        System.out.println("Inheritance.Interfaces.Callback called with:  " + parent);
    }

    void nonIfaceMeth()  // Implementing class can have other members and functions defined
    {
        System.out.println("Classes that implement interfaces may also define other members too.");
    }
}

class AnotherClient implements Callback {
    @Override
    public void callback(int parent) {
        System.out.println("Another version of callback");
        System.out.println("p squared is:  " + (parent * parent));
    }
}

// use an abstract class to skip implementation of interface methods
abstract class Incomplete implements Callback {
    int a, b;

    /* Here, the class Inheritance.Interfaces.Incomplete does not implement callback() and must be declared as abstract. Any class that implements an
        interface but does not define it's functions must be defined as abstract*/
    void show() {
        System.out.println(a + " " + b);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Creating an object of the interface and overriding method call just like dynamic method dispatch
        Callback obj = new Client();
        obj.callback(69);

        obj = new AnotherClient();
        obj.callback(3);
    }
}
