package main.java.Inheritance;

// Using abstract methods and classes.
abstract class AbstractMethod {
    double dim1, dim2;

    AbstractMethod(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    // area() is now abstract
    abstract double area();
}

class Rectangle extends AbstractMethod {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle...");
        return dim1 * dim2;
    }
}

class Triangle extends AbstractMethod {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle...");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
//        AbstractMethod abstractMethod=new AbstractMethod(10,10);
        // Abstract classes objects cannot be made
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);

        // Below declaration is accepted as it is just a declaration, it has not been referenced yet
        AbstractMethod abstractMethod;

        abstractMethod = rectangle;
        abstractMethod.area();

        abstractMethod = triangle;
        abstractMethod.area();
    }
}