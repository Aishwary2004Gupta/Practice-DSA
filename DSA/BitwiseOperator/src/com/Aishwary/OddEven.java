package com.Aishwary;

public class OddEven {
    public static void main(String[] args) {
        int a = 61;
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return (a & 1) == 1; //& 1 will return a
                            // a has only two values because it is binary 0 or 1
                            //1 in the end means odd //0 means even
    }

}