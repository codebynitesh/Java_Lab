package D1_Assignment;
//6. Input currency in rupees and output in USD.
// As on 8 July 2026, 1 Dollar equals to 95.21 rupees 🙄
import java.util.Scanner;
public class CurrencyConverter {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees.");
                double rupees = sc.nextDouble();
                double dollars = rupees * 95.21;
                System.out.println( rupees + " INR" +  " is equivalent to " + dollars + " Dollars." );


    }
}
