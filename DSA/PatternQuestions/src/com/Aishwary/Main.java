package com.Aishwary;

public class Main {
    public static void main(String[] args) {
        pattern3(4);

    }
    //pattern31
    static void pattern31 (int n){
        int OriginalN = n;
        n = 2*n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = OriginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col)); //minimum distance from the outer wall
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    //pattern17
    static void pattern17 (int n) {
        for (int row = 1; row < 2*n; row++) {

            int c = row > n ? (2 * n) - row : row; //col number (the staring number of the row = col)

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) { //start from col number, going to 1
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) { //staring with 2, end at col number
                System.out.print(col + " ");
            }
            System.out.println(); //when all the loops are run add a new line
        }
    }

    //pattern30
    static void pattern30 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(); //when all the loops are run add a new line
        }
    }


    //pattern28
    static void pattern28 (int n){
        for (int row = 0; row < 2*n; row++) {
            int TotalNoOfCol = row > n ? (2 * n) - row : row; // starts when n = 5 // ? = then // : = else
            int NoOFSpaces = n - TotalNoOfCol;
            for (int s = 0; s < NoOFSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < TotalNoOfCol; col++) {
                System.out.print("* "); //what you have to print
            }
            System.out.println();
        }
    }

    //pattern5
    static void pattern5(int n){
        for (int row = 0; row <= (2 * n); row++) {
            int TotalNoOfCol = row > n ? (2 * n) - row : row;
            for (int col = 0; col < TotalNoOfCol; col++) {
                System.out.print("* "); //what you have to print
            }
            System.out.println();
        }
    }

    //pattern4
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " "); //what you have to print
            }
            System.out.println();
        }
    }

    //pattern1
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //when one row is printed we need to add a new line
            System.out.println(); //printing new line
        }
    }

    //pattern2
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println(); //printing new line
        }
    }


    //pattern3
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the column
            for (int col = 1; col <= n-row+1; col++) { //or col = 0; col <= n - row
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println(); //printing new line
        }
    }
}