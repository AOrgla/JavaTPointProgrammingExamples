import java.util.Scanner;

public class SpyNumber {

    //   arv, mille üksikute numbrite liitmisel ja korrutamisel tuleb sama tulemus
    public static void isSpyNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int spyNum = scanner.nextInt();
        int spyNumSum = spyNum;
        int digit;
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (spyNumSum > 0) {
            digit = spyNumSum % 10;
            sumOfDigits = sumOfDigits + digit;
            productOfDigits = productOfDigits * digit;
            spyNumSum = spyNumSum / 10;
        }

        if (sumOfDigits == productOfDigits) {
            System.out.println(spyNum + " Is a Spy Number");
        } else {
            System.out.println(spyNum + " Is not a Spy Number");
        }

    }

}
