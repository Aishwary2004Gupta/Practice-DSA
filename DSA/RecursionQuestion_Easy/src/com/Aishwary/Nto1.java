package com.Aishwary;

public class Nto1 { //print first then call
    public static void main(String[] args) {
        fun(6);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }

        System.out.println(n); //printing
        fun(n - 1); //function recalling
    }
}
