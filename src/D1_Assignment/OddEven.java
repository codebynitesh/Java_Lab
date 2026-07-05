package D1_Assignment;
//1. Write a program to print whether a number is even or odd, also take input from the user..
import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether is even or odd in nature.");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("The number is even in nature");
        }
        else {
            System.out.println("The number is odd in nature");
        } sc.close();
        }
}
