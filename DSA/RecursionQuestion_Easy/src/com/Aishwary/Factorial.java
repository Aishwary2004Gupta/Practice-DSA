package com.Aishwary;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n <= 1){
            return 1; //if it is 0 then also it will return 1
        }

        return n * fact(n - 1);
    }
}
