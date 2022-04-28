package main.java.WrapperClasses;

public class PreventingError {
    public static void main(String[] args) {
        Integer iOb=1000;
        int i=iOb.byteValue(); // manually unbox as byte

        System.out.println(i); // Does not display 1000 (instead garbage value printed) thus preventing an error
    }
}
