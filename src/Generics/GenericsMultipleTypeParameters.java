package Generics;

// A simple generic class with two type parameters T, and V.
class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(final T ob1, final V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // Show types of T and V
    public void showType() {
        System.out.println("Type of T is:  " + ob1.getClass().getName());
        System.out.println("Type of V is:  " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

public class GenericsMultipleTypeParameters {
    public static void main(final String[] args) {
        TwoGen multiParamObj = new TwoGen<Integer, Double>(10, Math.PI);
        multiParamObj.showType();
        multiParamObj.getOb1();
        multiParamObj.getOb2();

        System.out.println();

        multiParamObj = new TwoGen<String, Boolean>("Hello World", true);
        multiParamObj.showType();
        multiParamObj.getOb1();
        multiParamObj.getOb2();

        System.out.println();

        return;
    }
}
