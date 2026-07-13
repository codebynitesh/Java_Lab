package D2_ForLoop;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse.");
        int num = 563;

        int reverse = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}
