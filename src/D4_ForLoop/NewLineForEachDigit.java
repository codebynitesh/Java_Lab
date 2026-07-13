package D4_ForLoop;

import java.util.Scanner;

public class NewLineForEachDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        long num = sc.nextLong();
        long OrigNum = num;
        long reverse = 0;
        for (; num != 0; num /= 10) {
            long digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The result is ");
        for (; reverse != 0; reverse /= 10) {
            long newline = reverse % 10;
            System.out.println(newline);
        }


    }
}
