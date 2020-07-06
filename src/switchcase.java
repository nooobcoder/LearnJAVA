public class switchcase {
    public static void switchStatement(char value) {
        switch (value) {
            case 'A' -> System.out.println("Value is A");
            case 'B' -> System.out.println("Value is B");
            case 'C' -> System.out.println("Value is C");
            case 'D' -> System.out.println("Value is D");
            case 'E' -> System.out.println("Value is E");
            default -> System.out.println("Value not found!");
        }
    }

    public static void main(String[] args) {
        switchStatement('B');
        switchStatement('D');
        switchStatement('Z');
    }
}
