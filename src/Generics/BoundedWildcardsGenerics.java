package Generics;

// Two dimensional coordinates
class TwoD {
    int x, y;

    TwoD(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

// Three dimensional coordinates
class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        this.z = c;
    }
}

// Four dimensional coordinates
class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        this.t = d;
    }
}

// Generic class containing array of coordinates
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] obj) {
        this.coords = obj;
    }

    static void showXY(Coords<?> cord) {
        System.out.println("X/Y Coordinates");
        for (int i = 0; i < cord.coords.length; ++i) {
            System.out.println(cord.coords[i].x + " / " + cord.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> coord) {
        System.out.println("X/Y/Z Coordinates");
        for (int i = 0; i < coord.coords.length; ++i) {
            System.out.println(coord.coords[i].x + " / " + coord.coords[i].y + " / " + coord.coords[i].z);
            System.out.println();
        }
    }

    static void showAll(Coords<? extends FourD> coord) {
        System.out.println("X/Y/Z/T Coordinates");
        for (int i = 0; i < coord.coords.length; ++i) {
            System.out.println(coord.coords[i].x + " / " + coord.coords[i].y + " / " + coord.coords[i].z + " / "
                    + coord.coords[i].t);
            System.out.println();
        }
    }
}

public class BoundedWildcardsGenerics {
    public static void main(String[] args) {
        TwoD[] td = { new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 4), new TwoD(-1, -23) };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("Contents of tdlocs.");
        Coords.showXY(tdlocs);

        FourD[] fd = { new FourD(1, 2, 3, 4), new FourD(6, 8, 14, 8) };
        System.out.println("Contents of fdlocs");
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        Coords.showXY(fdlocs);
        Coords.showXYZ(fdlocs);
        Coords.showAll(fdlocs);
        System.out.println();
    }
}
