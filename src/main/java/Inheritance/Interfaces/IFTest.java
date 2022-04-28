package main.java.Inheritance.Interfaces;// Define an integer stack interface.

interface IntStack {
    void push(int item);  // load an item in the stack

    int pop();  // unload an item from the stack
}

class FixedStackUsingInterface implements IntStack {
    private final int[] stack;
    private int tos;

    // allocate and initialize stack

    public FixedStackUsingInterface(int size) {
        stack = new int[size];
        tos = -1;
    }

    // push an item on to the stack
    @Override
    public void push(int num) {
        if (tos == stack.length - 1)
            System.out.println("Stack is full, cannot insert the element");
        else {
            System.out.println("Inserted element:  " + num);
            stack[++tos] = num; // loading the element into the array
        }
    }

    @Override
    public int pop() {
        if (tos != -1)
            return stack[tos--];
        else {
            System.out.println("Stack underflow");
            return -1;  // -1 the stack has underflow
        }
    }
}

// Implement a growable stack that adjusts it's size with the inputs
class DynamicStack implements IntStack {
    private int[] stck;
    private int tos;

    public DynamicStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        // If stack is full, allocate a larger block
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            System.arraycopy(stck, 0, temp, 0, stck.length);
            stck = temp;
        }
        stck[++tos] = item;
        System.out.println("Inserted element:  " + item);
    }

    @Override
    public int pop() {
        if (tos == -1) {
            System.out.println("Stack has underflow");
            return -1;
        } else return stck[tos--];
    }
}

public class IFTest {
    public static void main(String[] args) {
        IntStack intStack = new FixedStackUsingInterface(5);
        intStack.push(12);
        intStack.push(-5);
        intStack.push(3);

        System.out.println("Deleted Item: " + intStack.pop());
        System.out.println("Deleted Item: " + intStack.pop());

        System.out.println("\nHANDLING WITH THE DYNAMIC STACK NOW\n");

        // Trying the dynamic stack
        intStack = new DynamicStack(6);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);

        System.out.println("Deleted:  " + intStack.pop());
    }
}
