package D5_ForLoop;
//Print the multiplication table of N
import java.util.Scanner;
public class TableOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the table of.");
        long n = sc.nextLong();
        for ( int i = 1 ; i <= 10 ; i = i+1) {
            System.out.println( n + " x " + i + " = " + n*i );
        }
        sc.close();
    }
}
