public class sumThreeToFive {
    public static void main(String[] args) {
        // Program to print five numbers from 1 to 1000 (inclusive) that are divisible by both 3 and 5
        int sum = 0;
        // Limits loop executing only upto 5 numbers satisfying the condition
        int lim = 5;

        for (int loop = 1; loop <= 1000; ++loop) {
            if (lim == 0)
                break;
            else {
                if (loop % 3 == 0 && loop % 5 == 0) {
                    System.out.println(loop);
                    sum += loop;
                    lim--;
                }
            }
        }
        System.out.println("The sum is, " + sum);
    }
}
