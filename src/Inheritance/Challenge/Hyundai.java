package Inheritance.Challenge;

/**
 * Challenge.
 * Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
 * Finally, create another class, a specific type of Car that inherits from the Car class.
 * You should be able to hand steering, changing gears, and moving (speed in other words).
 * You will want to decide where to put the appropriate state and behaviours (fields and methods).
 * As mentioned above, changing gears, increasing/decreasing speed should be included.
 * For you specific type of vehicle you will want to add something specific for that type of car.
 */

public class Hyundai extends Car {
    private int roadServiceMonths;

    public Hyundai(int roadServiceMonths) {
        super("Hyundai", "Sedan", 4, 4, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10)
            changeGear(1);
        else if (newVelocity > 10 && newVelocity <= 20)
            changeGear(2);
        else if (newVelocity > 20 && newVelocity <= 30)
            changeGear(3);
        else changeGear(4);

        {
            if (newVelocity > 0)
                changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
