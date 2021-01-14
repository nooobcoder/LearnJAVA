/*
Java includes a feature called static import that expands the capabilities of theimport keyword. By following import with the keyword static, an importstatement can be used to import the static members of a class or interface.When using static import, it is possible to refer to static members directly bytheir names, without having to qualify them with the name of their class. Thissimplifies and shortens the syntax required to use a static member.To understand the usefulness of static import, let’s begin with an examplethat does not use it. The following program computes the hypotenuse of a righttriangle. It uses two static methods from Java’s built-in math class Math,which is part of java.lang. The first is Math.pow( ), which returns a valueraised to a specified power. The second is Math.sqrt( ), which returns thesquare root of its argument.
*/

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

// Compute the hypotenuse of a right triangle.
public class StaticImport {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        // Notice how sqrt() and pow() must be qualified by their class names, which is
        // Math
        // hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)); // Without using
        // static import

        hypot = sqrt(pow(side1, 2) + pow(side2, 2)); // After using static imports, their class names are not required.

        out.println("Given sides of lengths " + side1 + " and " + side2 + " the hypotenuse is,  " + hypot);
    }
}
