package com.Aishwary;

public class Pattern {
    public static void main(String[] args) {
        pattern2(4, 0); //row starts from 4

    }
    //triangle (printing when coming out of stack) (starting will be from row 1)
    static void pattern2 (int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            pattern2(row, col+1);
            System.out.print("* "); // after
        }else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }


    // upside down triangle (printing when going inside stack)
    static void pattern1 (int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("* "); //before
            pattern1(row, col+1);
        }else {
            System.out.println(); //will print a new line when c == r
            pattern1(row - 1, 0); // again col starts from 0 till less than row
        }
    }
}