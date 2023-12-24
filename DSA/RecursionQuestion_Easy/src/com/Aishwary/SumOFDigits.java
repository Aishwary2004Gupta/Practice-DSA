package com.Aishwary;

public class SumOFDigits {
    public static void main(String[] args) {
        int ans = digit(1234);
        System.out.println(ans);
    }
    static int digit (int n) {
        if ( n == 0){
            return 0;
        }
        return digit(n / 10) + (n % 10); //1+2+3+4
                                    //remainder = last digit
    }
}
