package com.Aishwary;

public class BS_Recursion {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,12,15};
        int target = 8;
        System.out.println(BS(arr, target,0, arr.length - 1));
    }
    static int BS (int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]) {
            return BS(arr, target, s, m - 1); //recursion (e = m-1) = BS
        }
        return BS(arr, target, m + 1, e); //make sure to return the result of a function call of the return type
    }
}
