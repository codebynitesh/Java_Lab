package D4_ForLoop;
import java.util.Scanner;
public class FindSmallestdigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        long num = sc.nextLong();
        long OrigNum = num;
        long smallest = 9;
        for (; num != 0 ; num /= 10){
            long digit = num%10;
            if (digit < smallest) {
                smallest = digit;
            }
        }  System.out.println("The smallest digit in " + OrigNum + " is " + smallest + ".");

    }
}
