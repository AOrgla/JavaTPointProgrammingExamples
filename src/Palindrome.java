import java.util.Scanner;

public class Palindrome {

    public static void palindromeTest() {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        int remainder = 0;
        int newNumber = 0;
        int num = temp;
        while (temp > 0) {
            remainder = temp % 10;
            newNumber = (newNumber * 10) + remainder;
            temp = temp / 10;
        }

        if (num == newNumber) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");
        }
    }

}
