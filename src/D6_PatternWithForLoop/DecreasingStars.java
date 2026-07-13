package D6_PatternWithForLoop;

// Print
//*****
//****
//***
//**
//*
public class DecreasingStars {
    public static void main(String args[]) {
        for (int i = 5; i != 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}