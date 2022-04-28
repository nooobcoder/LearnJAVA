package main.java.Enumerations;

enum ApplesPositionalEnum {
    Jonathan, Goldendel, RedDel, Winesap, Cortland;
}

public class OrdinalValuesComparetoEquals {
    public static void main(String[] args) {
        ApplesPositionalEnum ap, ap2, ap3;

        // Obtain all ordinal values using ordinal
        for (ApplesPositionalEnum a : ApplesPositionalEnum.values()) {
            System.out.println(a + " @ " + a.ordinal());
        }

        ap = ApplesPositionalEnum.RedDel;
        ap2 = ApplesPositionalEnum.Goldendel;
        ap3 = ApplesPositionalEnum.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " comes before " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " equals " + ap3);
        }

        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Error!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
