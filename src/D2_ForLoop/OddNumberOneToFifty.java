package D2_ForLoop;

public class OddNumberOneToFifty {
    public static void main(String args[]) {
        for  ( int i = 1 ; i <= 50 ; i++) {
            if ( i%2 != 0 ) {
                System.out.println(i);
            }
        }
    }
}