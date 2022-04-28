// At its core, the term generics means parameterized types. Parameterized typesare important because they enable you to create classes, interfaces, andmethods in which the type of data upon which they operate is specified as aparameter. Using generics, it is possible to create a single class, for example,that automatically works with different types of data. A class, interface, ormethod that operates on a parameterized type is called generic, as in genericclass or generic method.

// CAUTION Warning to C++ Programmers: Although generics are similar to templates inC++, they are not the same. There are some fundamental differences between the twoapproaches to generic types. If you have a background in C++, it is important not tojump to conclusions about how generics work in Java.

// A simple generic. class
// Here, T is a parameter that will be replaced by a real type when an object of Gen is created.
package main.java.Generics;
class Gen<T> {
    T ob; // Declare an object of T

    // Pass the constructor a reference to an object of type T
    Gen(T o) {
        ob = o;
    }

    // Return ob
    T getOb() {
        return ob;
    }

    // Show type of t
    void showType() {
        System.out.println("Type of T is:  " + ob.getClass().getName());
    }
}

public class Generics {
    public static void main(String[] args) {
        // Create a gen reference for Integers.
        Gen<Integer> gObj;

        /*
         * Create a Gen<Integer> object and assign it's reference to iOb. Notice the use
         * of autoboxing to encapsulate the value 88 within an Integer object.
         */
        gObj = new Gen<Integer>(88);
        // gObj = new Gen<Integer>(Integer.valueOf(88)); // Manually performing boxing.

        // Show the type of data used by gObj;
        gObj.showType();

        // Get the value in v. Notice that no cast is needed.
        int v = gObj.getOb();
        System.out.println("Value:  " + v);

        System.out.println();

        // Testing generics again but with the String class this time.
        Gen<String> gObjStr = new Gen<String>("Testing main.java.Generics");
        gObjStr.showType();
        String str = gObjStr.getOb();
        System.out.println(str);

        System.out.println();
    }
}
