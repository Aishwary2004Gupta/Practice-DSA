package com.Aishwary;

public class PowOf2 {
    public static void main(String[] args) {
        int n = 8; //0 is an exception
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
