package main.java.ClassesInJava;

// Demonstration of the instanceof operator in Java
class A {
    int i, j;
}

class B extends A {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("a is instance of A:  " + (a instanceof A));
        System.out.println("b is instance of B:  " + (b instanceof B));
        System.out.println("c is instance of C:  " + (c instanceof C));
        System.out.println("c can be cast to A:  " + (c instanceof A));
        System.out.println("a can be cast to C:  " + (a instanceof C));

        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob now refers to d");
        System.out.println("ob is instance of D:" + (ob instanceof D));

        System.out.println();

        ob = c; // A reference to c
        System.out.println("ob now refers to c");
        System.out.println("ob can be cast to D:  " + (ob instanceof D));
        System.out.println("ob can be cast to B:  " + (ob instanceof B));
        System.out.println("ob can be cast to A:  " + (ob instanceof A));

        // All objects can be cast to Object
        System.out.println("a may be cast to Object  " + (a instanceof Object));
        System.out.println("b may be cast to Object  " + (b instanceof Object));
        System.out.println("c may be cast to Object  " + (c instanceof Object));
        System.out.println("d may be cast to Object  " + (d instanceof Object));

    }
}
