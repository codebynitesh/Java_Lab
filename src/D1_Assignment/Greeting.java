package D1_Assignment;
//2. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Greeting {
    public static void main(String args[]) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        System.out.println("Hello " + name + ", Nice to meet you!");
        sc.close();
    }
}
