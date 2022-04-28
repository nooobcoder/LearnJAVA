package main.java.Inheritance;

public class Dog extends Animal {

    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    /* Overriding the eat function of the Animal base class. Remember, not confuse function overriding with
     function overloading. The thing that is shown below is function overriding. Function overriding is a
     concept of inheritance.*/

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        System.out.println("Now calling overridden function from the super class.");
        super.eat();
    }

    public void walk() {
        System.out.println("Inside dog.walk() function");
        super.move(5);
    }

    public void run() {
        System.out.println("Inside dog.run() function");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
