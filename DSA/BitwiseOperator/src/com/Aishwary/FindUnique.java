package com.Aishwary;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,1,4,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {//for every number in my arr
            unique ^= n;
        }

        return unique;
    }
}
