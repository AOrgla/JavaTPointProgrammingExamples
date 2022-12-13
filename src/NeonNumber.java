import java.util.Scanner;

public class NeonNumber {

    public static void neonNumberChecker() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sq = a * a;
        int digit;
        int sumOfDigits = 0;

        while (sq > 0) {
            digit = sq % 10;
            sumOfDigits = sumOfDigits + digit;
            sq = sq / 10;
        }

        if (a == sumOfDigits) {
            System.out.println("neon number");
        } else {
            System.out.println("not a neon number");
        }
    }

}
