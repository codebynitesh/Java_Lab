package D2_ForLoop;
import java.util.Scanner;
public class SumTillOneToN {
    public static void main(String args[]){
        System.out.println("Enter the number you want the sum till that number. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for ( int i =1 ; i <= n ; i++) {
            sum += i;}
        System.out.println(sum);

    }
}
