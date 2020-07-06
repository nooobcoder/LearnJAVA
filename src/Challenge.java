public class Challenge {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            // Feet is converted to inches and added to inch, then converted to cm
            return ((feet * 12) + inches) * 2.54;
        } else return -1; // Indicating an invalidation of data
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            // Inches are converted to feet
            return inches * 0.0833333;
        } else return -1; // Indicating an invalidation of data
    }

    public static void main(String[] args) {

    }
}
