package main.java.Generics;

class NonGen {
    Object ob; // ob is of now type Object

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is, " + ob.getClass().getName());
    }
}

public class NonGenerics {
    public static void main(String[] args) {
        NonGen obj = new NonGen(88);
        obj.showType();
        int val = (Integer) obj.getOb();
        System.out.println(val);

        NonGen strObj = new NonGen("Non-main.java.Generics Test");
        strObj.showType();
        String valStr = (String) strObj.getOb();
        System.out.println(valStr);

        obj = strObj; // This compiles but is wrong
        val = (Integer) obj.getOb(); // Run-time error
    }
}
