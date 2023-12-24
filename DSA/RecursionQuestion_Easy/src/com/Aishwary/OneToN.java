package com.Aishwary;

public class OneToN { //call first then print
    public static void main(String[] args) {
//        fun(6);
        funBoth(6);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        fun(n-1); //calling
        System.out.println(n); //printing
    }

    static void funBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n); //printinh
        funBoth(n-1); //calling
        System.out.println(n); //printing
    }
}
