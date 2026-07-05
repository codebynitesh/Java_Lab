package D4_ForLoop;
import java.util.Scanner;
//Product of digits of a number
public class ProductOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for getting its products of its digits.");
        long num = sc.nextLong();
        long Orgnum = num;
        long product = 1;
        for (; num != 0; num /= 10 ) {
            long digit = num%10;
            product *= digit ;
        }
        System.out.println("The product of the digits of " + Orgnum + " is " + product + ".");
    }
}
