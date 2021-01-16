package Enumerations;

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

// Below is an example to use an enum with key,value combination
enum Status {
    ACTIVE("Active", 1), IN_ACTIVE("In Active", 2),GET_ME("tHEIR",23);

    private final String key;
    private final Integer value;

    Status(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
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
