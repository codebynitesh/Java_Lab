package D3_ForLoop;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the sum of digits.");
        long num = sc.nextLong();
        long OriginalNum = num;
         long sum = 0;
        for (; num != 0 ; num = num /10 ) {
            long digit = num%10;
            sum = sum + digit;
        }
        System.out.println("The sum of " + OriginalNum + " is " + sum + "." );
    }
}
