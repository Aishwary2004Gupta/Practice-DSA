package com.Aishwary;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 1;

        int ans = 0;
        int base = 5; //starting

        while(n > 0){
            int last = n & 1;
            n = n >> 1; //right shift
            ans += last * base; //(ans + last) * base
            base = base * 5;
        }
        System.out.println(ans);
    }
}
