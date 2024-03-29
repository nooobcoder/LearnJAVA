package main.java.Inheritance.Challenge;

/**
 * Challenge.
 * Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
 * Finally, create another class, a specific type of Car that inherits from the Car class.
 * You should be able to hand steering, changing gears, and moving (speed in other words).
 * You will want to decide where to put the appropriate state and behaviours (fields and methods).
 * As mentioned above, changing gears, increasing/decreasing speed should be included.
 * For you specific type of vehicle you will want to add something specific for that type of car.
 */

public class Car extends Vehicle {
    private int wheels, gears, doors, currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity, " + speed + " in direction, " + direction);
        move(speed, direction);
    }
}
