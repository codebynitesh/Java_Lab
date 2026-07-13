package D3_ForLoop;

import java.util.Scanner;

public class CountDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digits.");
        long num = sc.nextLong();
        long OriginalNum = num;
        int count = 0;
        for (; num != 0; num = num / 10) {
            count++;
        }
        System.out.println("The number of digits in " + OriginalNum + " is " + count);
        sc.close();
    }
}
