package Enumerations;

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("OUPUT OF ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) {
            System.out.println("ap CONTAINS GOLDENDEL.");
        }
        switch (ap) {
            case Jonathan -> System.out.println("Jonathan is red.");
            case GoldenDel -> System.out.println("Golden Delicious is yellow.");
            case RedDel -> System.out.println("Red Delicious is red.");
            case Winesap -> System.out.println("Winesap is red.");
            case Cortland -> System.out.println("Cortland is red.");
        }
    }
}
