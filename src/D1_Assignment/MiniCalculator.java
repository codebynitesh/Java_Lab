package D1_Assignment;
//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class MiniCalculator {
    public static void main(String args[]) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        System.out.println(" Choose the operator among * , /, - and +");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second number.");
        double B = sc.nextDouble();
        if (operator == '-') {
            double Result = A - B;
            System.out.println(Result);
        } else if (operator == '+') {
            double Result = A + B;
            System.out.println(Result);
        } else  if (operator == '/') {
            double Result = A / B;
            System.out.println(Result);
        }  else  if (operator == '*') {
            double Result = A * B;
            System.out.println(Result);
        } else {
            System.out.println("Invalid input");
        }sc.close();

    }
}
