package D1_Basics;
import java.util.Scanner;
public class Greeting {
    public static void main(String args[]) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        System.out.println("Hello " + name + ", Nice to meet you!");

    }
}
