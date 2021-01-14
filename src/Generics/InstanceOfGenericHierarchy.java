package Generics;

class GenericSuper3<T> {
    T obj;

    GenericSuper3(T obj) {
        this.obj = obj;
    }

    T getOb() {
        return this.obj;
    }
}

class GenericSubclass3<T> extends GenericSuper3<T> {
    GenericSubclass3(T ob) {
        super(ob);
    }
}

public class InstanceOfGenericHierarchy {
    public static void main(String[] args) {
        GenericSuper3<Integer> a = new GenericSuper3<>(22);
        GenericSubclass3<Integer> b = new GenericSubclass3<>(33);
        GenericSubclass3<String> c = new GenericSubclass3<>("String value");

        System.out.println("b instance of Sub class?  " + (b instanceof GenericSubclass3<?>));
        System.out.println("b instance of Super class?  " + (b instanceof GenericSuper3<?>));
        System.out.println();

        System.out.println("c instance of Sub class?  " + (c instanceof GenericSubclass3<?>));
        System.out.println("c instance of Super class?  " + (c instanceof GenericSuper3<?>));
        System.out.println();

        System.out.println("a instance of Sub class?  " + (a instanceof GenericSubclass3<?>));
        System.out.println("a instance of Super class?  " + (a instanceof GenericSuper3<?>));
        System.out.println();

        System.out.println("a instance of Sub class?  " + (a instanceof GenericSubclass3<?>));
        System.out.println("a instance of Super class?  " + (a instanceof GenericSuper3<?>));
        System.out.println();

        System.out.println((b instanceof GenericSubclass3<Integer>));
        // System.out.println((c instanceof GenericSubclass3<Integer>)); // This would cause a compile-time error
        System.out.println();

        System.out.println();
    }
}
