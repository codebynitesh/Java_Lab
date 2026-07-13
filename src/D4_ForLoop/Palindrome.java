package D4_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a palindrome number.");
        long num = sc.nextLong();
        long OrigNum = num;
        long reverse = 0;
        for (; num != 0; num /= 10) {
            long digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        if (reverse == OrigNum) {
            System.out.println("The provided number is a palindrome number.");
        } else {
            System.out.println("The provided number is not a palindrome number.");
        }
    }
}
