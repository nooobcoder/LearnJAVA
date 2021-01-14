package Generics;

class GenericSuper4<T> {
    T ob;

    GenericSuper4(T ob) {
        this.ob = ob;
    }

    T getOb() {
        System.out.print("Super's getOb():  ");
        return ob;
    }
}

class GenericSubclass4<T> extends GenericSuper4<T> {
    GenericSubclass4(T obj) {
        super(obj);
    }

    // Override getOb()
    T getOb() {
        System.out.print("Sub class's getOb():  ");
        return ob;
    }
}

public class GenericMethodOverriding {
    public static void main(String[] args) {
        GenericSuper4<Integer> iOb = new GenericSuper4<Integer>(22);
        GenericSubclass4<Integer> iOb2 = new GenericSubclass4<Integer>(99);
        GenericSubclass4<String> strOb = new GenericSubclass4<String>("Generic Test");
        
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb.getOb());
    }
}
