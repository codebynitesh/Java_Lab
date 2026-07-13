package D6_PatternWithForLoop;

//print
//*****
//*****
//*****
//*****
//*****
public class ParadePattern {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 1; i <= 25; i++) {
            System.out.print("*");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }

    }
}
