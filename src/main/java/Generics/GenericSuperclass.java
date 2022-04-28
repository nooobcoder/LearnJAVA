package main.java.Generics;

// A simple generic class hierarchy
class GenericSuper<T> {
    T ob;

    GenericSuper(T ob) {
        this.ob = ob;
    }

    // Return ob
    T getOb() {
        return ob;
    }
}

// A sub-class of GenericSuper that has it's own type parameter, 'V'
class GenericSub<T, V> extends GenericSuper<T> {
    V ob;

    GenericSub(T o, V ob) {
        super(o);
        this.ob = ob;
    }

    V getSubOb() {
        return ob;
    }
}

// Creating an object of GenericSub
public class GenericSuperclass {
    public static void main(String[] args) {
        GenericSub<String, Integer> obj = new GenericSub<String, Integer>("Hierarchy", 23);
        System.out.println("Value from SuperClass:  " + obj.getOb()); // getOb is a function in the super class
        System.out.println("Value from SubClass:  " + obj.getSubOb()); // getSubOb is a function in the sub class.
        System.out.println();
    }
}
