package D1_Assignment;
import java.util.Scanner;
public class AgeChecker {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age");
         int Age = sc.nextInt();
         if (Age >= 18) {
             System.out.println("You are eligible for voting. ");
         } else {
             System.out.println("You are not eligible for voting yet.");
         }
    }
}
