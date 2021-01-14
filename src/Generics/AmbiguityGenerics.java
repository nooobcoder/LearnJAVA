package Generics;

// Ambiguity caused by erasure on overloaded methods
class MyGenClass<T, V extends Number> {
    T ob1;
    V ob2;

    // These two overloaded methods are ambiguous and will not compile
    void set(T ob1) {
        this.ob1 = ob1;
    }

    void set(V ob2) {
        this.ob2 = ob2;
    }

    /*
     * First, as MyGenClass is written, there is no requirement that T and Vactually
     * be different types. For example, it is perfectly correct (in principle)
     * toconstruct a MyGenClass object as shown here:MyGenClass<String, String> obj
     * = new MyGenClass<String, String>()In this case, both T and V will be replaced
     * by String. This makes both versionsof set( ) identical, which is, of course,
     * an error.
     */
}

public class AmbiguityGenerics {
    public static void main(String[] args) {

    }
}
