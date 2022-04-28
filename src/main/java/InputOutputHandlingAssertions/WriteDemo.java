package main.java.InputOutputHandlingAssertions;

public class WriteDemo {
    public static void main(String[] args) {
        int b = 'A';
        System.out.write(b);
        System.out.flush(); // This is very necessary
    }
}
