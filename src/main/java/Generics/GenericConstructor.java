package main.java.Generics;

class GenCons {
    private double val;

    <T extends Number> GenCons(T ob) {
        val = ob.doubleValue();
    }

    void showVal() {
        System.out.println("val:  " + val);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        GenCons obj1 = new GenCons(23.42);
        GenCons obj2 = new GenCons(6.7);

        obj1.showVal();
        obj2.showVal();
    }
}
