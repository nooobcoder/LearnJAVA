package WrapperClasses;

public class Wrap {
    public static void main(String[] args) {
        // Converting a numeric value to a Wrapper type object
        Integer iOb = Integer.valueOf(100);
//        Integer iOb = 200; // Autoboxing takes place here
//        int unbox=iOb; // Auto-unboxing
        System.out.println("Numeric Value:  " + iOb.intValue());
        System.out.println("Wrapper Object:  " + iOb);
    }
}
