package com.Aishwary;

public class ProductOFDigits {
    public static void main(String[] args) {
        int ans = digit(1234);
        System.out.println(ans);
    }
    static int digit (int n) {
        if ( n % 10 == n){
            return n;
        }
        return digit(n / 10) * (n % 10); //1*2*3*4
                                    //remainder = last digit 
    }
}
