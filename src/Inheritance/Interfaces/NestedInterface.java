package Inheritance.Interfaces;

// We can also have nested interfaces in Java, see below example to understand how to implement it
// This class contains a member interface
class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        A.NestedIF obj = new B();

        if (obj.isNotNegative(-2))
            System.out.println("Not negative");
        else System.out.println("Negative Number");
    }
}
