package Inheritance.Interfaces;

// One iterface can extend another interface
interface A1 {
    void meth1();
    void meth2();
}

// B1 extends A1 and now includes meth1 and meth2 methos
interface B1 extends A1 {
    void meth3();
}

class ExtInterface implements B1{
    @Override
    public void meth1() {
        System.out.println("Implementation method 1()");
    }

    @Override
    public void meth2() {
        System.out.println("Implementation method 2()");
    }

    @Override
    public void meth3() {
        System.out.println("Implementation method 3()");
    }
}

public class ExtendingInterfaces
{
    public static void main(String[] args) {
        ExtInterface obj=new ExtInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();

        ((B1) obj).meth1();
        ((B1) obj).meth2();
        ((B1) obj).meth3();
    }
}
