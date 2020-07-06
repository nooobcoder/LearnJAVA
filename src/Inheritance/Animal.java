package Inheritance;

public class Animal {
    private int brain, body, size, weight;
    private String name;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called");
        System.out.println("Animal is moving @" + speed + " Km/h");
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
