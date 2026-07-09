package D1_Assignment;
import java.util.Scanner;

public class ArmstrongBetweenTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {

            int original = i;
            int temp = i;
            int digits = 0;
            int sum = 0;

            // Count the number of digits
            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            temp = original;

            // Calculate the sum of each digit raised to the power of digits
            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}