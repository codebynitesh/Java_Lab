package D1_Assignment1;
//7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        long a = 0;
        long b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            long fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
    }
}