package Generics;

// A non-generic super class which is extended by it's generic sub class below
class GenericSuper2 {
    int val = 0;

    GenericSuper2(int val) {
        this.val = val;
    }

    int getNum() {
        return this.val;
    }
}

// A generic sub class
class GenericSubclass2<T> extends GenericSuper2 {
    T ob;

    GenericSubclass2(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    T getSubOb() {
        return this.ob;
    }
}

public class GenericSubclass {
    public static void main(String[] args) {
        GenericSubclass2<String> obj = new GenericSubclass2<String>("The value is: ", 42);
        System.out.println(obj.getSubOb() + " " + obj.getNum());
        System.out.println();
    }
}
