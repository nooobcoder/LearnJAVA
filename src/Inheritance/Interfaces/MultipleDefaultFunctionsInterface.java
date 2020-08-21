package Inheritance.Interfaces;

interface A2 {
    default void display() {
        System.out.println("A2's display default");
    }
}

interface B2 {
    default void display() {
        System.out.println("B2's display default");
    }
}

class implementMultipleInterface implements A2, B2 {
    /** In this case, as the class has implemented both the interface and both of them have the display function,
     an override is required to compile without error*/

    @Override
    public void display() {
        System.out.println("Implementor class's default call");
    }
}

public class MultipleDefaultFunctionsInterface {
    public static void main(String[] args) {
        implementMultipleInterface object=new implementMultipleInterface();
        object.display();  // class version of the function

        A2 intfObj=new implementMultipleInterface();
        intfObj.display();

        B2 intfObj2=new implementMultipleInterface();
        intfObj2.display();
    }
}
