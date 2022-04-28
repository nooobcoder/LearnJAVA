package main.java.Generics;

/*In the preceding examples, the type parameters could be replaced by any classtype. This is fine for many purposes, but sometimes it is useful to limit thetypes that can be passed to a type parameter. For example, assume that youwant to create a generic class that contains a method that returns the average ofan array of numbers. Furthermore, you want to use the class to obtain theaverage of an array of any type of number, including integers, floats, anddoubles. Thus, you want to specify the type of the numbers generically, using atype parameter.  */

/*In Stats, the average( ) method attempts to obtain the double version of eachnumber in the nums array by calling doubleValue( ). Because all numericclasses, such as Integer and Double, are subclasses of Number, and Numberdefines the doubleValue( ) method, this method is available to all numericwrapper classes. The trouble is that the compiler has no way to know that youare intending to create Stats objects using only numeric types. Thus, when youtry to compile Stats, an error is reported that indicates that the doubleValue( )method is unknown. To solve this problem, you need some way to tell thecompiler that you intend to pass only numeric types to T. Furthermore, youneed some way to ensure that only numeric types are actually passed.To handle such situations, Java provides bounded types. When specifying atype parameter, you can create an upper bound that declares the superclassfrom which all type arguments must be derived. This is accomplished throughthe use of an extends clause when specifying the type parameter, as shownhere:<T extends superclass> */

// Stats attempts to create a generic class that can compute the average of an array of numbers of any given numeric type.
class Stats<T extends Number> { // The argument list must extend the superclass 'Number' to tell the compiler
                                // that only numeric data to be handled.

    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    // Return type is double in all cases
    double getAverage() {
        double sum = 0.0d;
        for (T iterate : nums) {
            sum += iterate.doubleValue(); // Error here if Number class is not extended in the argument list <T extends
                                          // Number>
        }
        return sum / nums.length;
    }

    // ! WILDCARDING GENERIC CLASS PARAMETERS
    /*
     * As useful as type safety is, sometimes it can get in the way of
     * perfectlyacceptable constructs. For example, given the Stats class shown at
     * the end ofthe preceding section, assume that you want to add a method called
     * sameAvg( )that determines if two Stats objects contain arrays that yield the
     * same average,no matter what type of numeric data each object holds. For
     * example, if oneobject contains the double values 1.0, 2.0, and 3.0, and the
     * other object contains the integer values 2, 1, and 3, then the averages will
     * be the same. Oneway to implement sameAvg( ) is to pass it a Stats argument,
     * and then comparethe average of that argument against the invoking object,
     * returning true only ifthe averages are the same To create a generic sameAvg(
     * ) method, you must use another feature ofJava generics: the wildcard
     * argument. The wildcard argument is specified bythe ?, and it &represents an
     * unknown type. Using a wildcard, here is one way towrite the sameAvg( ) method
     */

    boolean sameAvg(Stats<?> ob2) {
        if (this.getAverage() == ob2.getAverage())
            return true;
        else
            return false;
    }
}

public class BoundedGenericClasses {
    public static void main(String[] args) {
        Integer iNums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> obj = new Stats<Integer>(iNums);
        double computedAverage = obj.getAverage();
        System.out.println("Computed Average:  " + computedAverage + "\n");

        Double dNums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> obj2 = new Stats<Double>(dNums);
        computedAverage = obj2.getAverage();
        System.out.println("Computed Average:  " + computedAverage + "\n");

        Integer iNums2[] = { 1, 2, 3, 4, 5 };
        Double dNums2[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        obj = new Stats<Integer>(iNums2);
        obj2 = new Stats<Double>(dNums2);
        boolean sameAverage = obj.sameAvg(obj2);
        System.out.println("Same Average:  " + sameAverage);
    }
}
