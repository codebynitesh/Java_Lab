package D2_ForLoop;

import java.util.Scanner;

//Find the factorial of a number.
public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you need the factorial of. ");
        int n = sc.nextInt();
        int factorial = 1;
        for ( int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " +  n + " is " + factorial + ".");
        sc.close();

    }
}
