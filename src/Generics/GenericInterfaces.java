package Generics;

// A min/max interface.
interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class ImplementMinMax<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    ImplementMinMax(T[] o) {
        this.vals = o;
    }

    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; ++i) {
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        }
        return v;
    }

    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; ++i) {
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        }
        return v;
    }
}

public class GenericInterfaces {
    public static void main(String[] args) {
        Integer iNums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };

        ImplementMinMax<Integer> ob = new ImplementMinMax<>(iNums);
        ImplementMinMax<Character> ob2 = new ImplementMinMax<>(chs);

        System.out.println("Max value in iNums:  " + ob.max() + "\nMin value in iNums:  " + ob.min());
        System.out.println("Max value in chs:  " + ob2.max() + "\nMin value in chs:  " + ob2.min());
    }
}
