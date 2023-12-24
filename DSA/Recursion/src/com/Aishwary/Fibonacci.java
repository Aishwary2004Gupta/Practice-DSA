package com.Aishwary;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = FiboNum(7); //Exponential
//        System.out.println(ans);

//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));

    }
    //2.
    static int fiboFormula (int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5)); // Golden ratio
    }
    //1.
    static int FiboNum (int n){

        //Base condition (answers that we already know)
        if (n < 2){
            return n;
        }
        return FiboNum(n-1) + FiboNum(n-2);
    }
}
