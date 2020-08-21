package Exceptions.UserDefinedException;

// Creating a custom exception class by inheriting a subclass 'Exception' of 'Throwable'
class MyException extends Exception {
    int num;

    public MyException(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Custom Exception [" + num + "]";
    }
}

public class ExceptionDemo {
    void implementMyException(int h) throws MyException {
        System.out.println("Called iplementMyException[" + h + "]");
        if (h > 10) // throw the exception
            throw new MyException(h);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            new ExceptionDemo().implementMyException(2);
            new ExceptionDemo().implementMyException(42);
            new ExceptionDemo().implementMyException(94);  // this function would not be called as the previos call throws an error
        } catch (MyException myException) {
            System.out.println("Caught: " + myException);
        } finally {
            System.out.println("Call Over\n\n");
        }
    }
}