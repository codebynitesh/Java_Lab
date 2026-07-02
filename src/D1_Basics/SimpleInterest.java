package D1_Basics;
//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        double P = sc.nextDouble();
        System.out.println("Enter the time period");
        double T = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double R = sc.nextDouble();
        double Final_Amount = (P * T * R)/(100) + P;
        System.out.println("The final amount is " + Final_Amount);

    }
}
