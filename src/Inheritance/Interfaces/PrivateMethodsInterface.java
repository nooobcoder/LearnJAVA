package Inheritance.Interfaces;

/*
 * A private method interface can only be called by a default method or by another private method.
 * Because a private interface method is specified private, it cannot be used by code
 * outside the interface in which it is defined. This restriction includes subinterfaces because a
 * private interface method is not inherited by a subinterface
 */

interface privateInterfaceFunctions {
    void push(int item);

    int pop();  // retrieve and then delete the item

    // A default method that returns an array that contains the top n elements on the stack
    default int[] popNElements(int n) {
        // Return the requested elements
        return getElements(n);
    }

    // A default method that returns an array that contains the next n elements on the stack after
    // skipping elements
    default int[] skipAndPopNElements(int skip, int n) {
        // Skip the specified number of elements
        getElements(skip);

        // Return the requested elements
        return getElements(n);
    }

    // A private method that returns an array containing the top n elements on the stack
    private int[] getElements(int n) {
        int[] element = new int[n];

        for (int i = 0; i < n; ++i)
            element[i] = pop();
        return element;
    }
}

/*Notice that both popNElements and skipAndPopNElements use the private getElements method to obtain the array to return
 * This prevents both methods from having to duplicate the same code sequence. Keep in mind that because getElements() is private,
 * it cannot be called by code outside the owner interface.*/

public class PrivateMethodsInterface {
    public static void main(String[] args) {

    }
}
