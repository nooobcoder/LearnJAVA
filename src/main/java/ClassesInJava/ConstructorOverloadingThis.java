/* you cannot use super( ) and this( ) in the same constructor becauseeach must be the first statement in the constructor. */
package main.java.ClassesInJava;

class MyClass {
    int a, b;

    // Below, we see the overloaded constructors.
    // Initialize a and b individually
    MyClass(int i, int j) {
        this.a = i;
        this.b = j;
    }

    // Initialize a and b to the same value
    MyClass(int i) {
        this(i, i); // invokes MyClass(i, i)
        // this.a = this.b = i;
    }

    // Initialize a and b with some default value
    MyClass() {
        this(0); // Invokes MyClass(0) and then MyClass(0, 0)
        /*
         * this.a = 100; this.b = 200;
         */
    }
}

public class ConstructorOverloadingThis {
    public static void main(String[] args) {
        MyClass ob = new MyClass(10, 20);
        System.out.println("ob1:  (a) => " + ob.a + "   (b) => " + ob.b);

        MyClass ob2 = new MyClass(100);
        System.out.println("ob2:  (a) => " + ob2.a + "   (b) => " + ob2.b);

        MyClass ob3 = new MyClass();
        System.out.println("ob3:  (a) => " + ob3.a + "   (b) => " + ob3.b);
    }
}
