package com.Aishwary;

public class PatternPractice {
    public static void main(String[] args) {
        patternRandom(5);

    }
    //patternRandom
    static void patternRandom (int n) {
        for (int row = 0; row < (2 * n); row++) {
            int TotalNoOfCol = row > n ? (2 * n) - row : row;
            for (int s = 0; s < TotalNoOfCol; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < TotalNoOfCol; col++) {
                System.out.print("* "); //what you have to print
            }
            System.out.println();
        }
    }
    
    //pattern7
    static void pattern7 (int n) {
        for (int row = 0; row < n; row++) {
            // space = row
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

