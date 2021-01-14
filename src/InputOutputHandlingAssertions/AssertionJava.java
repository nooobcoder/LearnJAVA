package InputOutputHandlingAssertions;
public class AssertionJava {
    static int val = 3;

    // Return an integer
    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int a = 0; a < 10; ++a) {
            n = getNum();
            assert n > 0 : "n is negative."; // will fail when n is > 0
            System.out.println("n is: " + n);
        }
    }
}
