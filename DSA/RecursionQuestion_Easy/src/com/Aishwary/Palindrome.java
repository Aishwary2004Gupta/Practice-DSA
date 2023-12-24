package com.Aishwary;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }
    static int rev(int n){
        //sometimes you may need some additional variable int the argument
        //in that case, make another function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) { //if the number is a single digit number
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n){
        return n == rev(n);
    }
}
