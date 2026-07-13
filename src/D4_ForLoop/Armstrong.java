package D4_ForLoop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Armstrong number.");
        long num = sc.nextLong();
        long OrigNum = num;
        long OrigNumber = num;
        long temp = 0;
        long count = 0;
        for (; num != 0; num /= 10) {
            count++;
        }
        for (; OrigNum != 0; OrigNum /= 10) {
            long digit = OrigNum % 10;
            temp = (long) (temp + Math.pow(digit, count));
        }
        if (temp == OrigNumber) {
            System.out.println(OrigNumber + " is an Armstrong number.");
        } else {
            System.out.println(OrigNumber + " is not an Armstrong number.");
        }
        ;
        sc.close();
    }
}
