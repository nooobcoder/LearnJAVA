package main.java.Generics;

class Bridger<T> {
    T ob;

    Bridger(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}

class Child extends Bridger<String> {
    String ob;

    Child(String s) {
        super(s);
        this.ob = s;
    }

    String getOb() {
        System.out.print("You called String getOb():  ");
        return ob;
    }
}

public class BridgeMethods {
    public static void main(String[] args) {
        Child ob = new Child("STRING VALUE");
        System.out.println(ob.getOb());
    }
}
