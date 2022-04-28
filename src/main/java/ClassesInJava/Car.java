package main.java.ClassesInJava;

public class Car {
    private int doors, wheels;
    private String model, engine, color;

    /*// This field would be available globally (anywhere outside the class)
    public int registrationNumber;
    public String model;*/

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
