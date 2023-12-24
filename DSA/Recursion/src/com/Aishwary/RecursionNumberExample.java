package com.Aishwary;

public class RecursionNumberExample {
    public static void main(String[] args) {
        Number(1); //print 1 2 3 4 5
    }
    static void Number(int n){
        if (n == 5){ //break condition
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //tail recursion
        //this is the last function call
        Number(n + 1); //recursive call
    }
}
