package D4_ForLoop;
//Find the largest digit

import java.util.Scanner;

public class FindLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long num = sc.nextLong();

        long originalNum = num; // Save the original number

        int largest = 0;

        for (; num != 0; num = num / 10) {

            int digit = (int) (num % 10); // Get the last digit

            if (digit > largest) {
                largest = digit; // Update largest digit
            }
        }

        System.out.println("The largest digit in " + originalNum + " is " + largest);

        sc.close();
    }
}