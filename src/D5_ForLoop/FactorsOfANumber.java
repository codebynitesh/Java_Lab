package D5_ForLoop;
//Find all factors of a number

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String args[]) {
        System.out.println("Enter a number whose factors you want to find: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}
