import java.util.Scanner;

public class code {
    public static void input() {
        Scanner scanner = new Scanner(System.in);

        for (int loop = 1; loop <= 10; ++loop) {
            System.out.println("Enter Number #" + loop);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println("Number entered: " + num);
            } else System.out.println("Invalid Number");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        input();
    }
}
