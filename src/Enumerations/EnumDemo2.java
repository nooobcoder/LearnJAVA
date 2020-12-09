package Enumerations;

enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 allapples[] = Apple2.values();

        System.out.println("Here are all Apple constants\n");
        for (Apple2 a :
                allapples) {
            System.out.println(a);
        }

        System.out.println();

        Apple2 app=Apple2.valueOf("Winesap");
        System.out.println("ap contains: "+app);
    }
}
