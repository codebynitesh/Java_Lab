package D2_ForLoop;

//Print multiples of 5 till 100.
public class MultiplesOfFiveTillFiveHundred {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 5; i <= 500; i += 5) {
            System.out.print(i + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
