package D1_Basics;
//5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String args[]){
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
       if (A>B) {
           System.out.println( A + "is greater than" + B );
       } else if (B>A){
           System.out.println(B  + " is greater than" + A);
       }else {
           System.out.println("Both the numbers are equal.");
       }
    }

}
