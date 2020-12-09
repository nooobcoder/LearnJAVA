package WrapperClasses;

public class BooleanCharAutoboxingUnboxingReboxing {
    public static void main(String[] args)throws InterruptedException {
        Boolean b = true;

        if (b) System.out.println("b is true");

        Character c = 'x';
        char ch2 = c;
        System.out.println("ch2 is " + ch2);
    }
}
