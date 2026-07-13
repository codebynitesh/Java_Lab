package D1_Assignment1;
//8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether if it is palindrome or not.");
        long num = sc.nextLong();
        long OrigNum = num;
        long palindrome = 0;
        for (; num != 0; num /= 10) {
            long digit = num % 10;
            palindrome = palindrome * 10 + digit;
        }
        if (palindrome == OrigNum) {
            System.out.println(palindrome + "is a palindrome number. I'm damn sure.");
        } else {
            System.out.println(palindrome + "is not a palindrome number.");
        }
    }
}
