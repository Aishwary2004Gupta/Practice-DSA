package com.Aishwary;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 32, 4, 54, 21};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    //imagine the arr is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    //Finding the maxVal in a range

//work on edge cases over here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end>start) {
            return -1;
        }
        if (arr.length == 0){
            return 0;
        }

        int maxVal = arr[start];
        for (int i = start ; i <= end; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
            return maxVal;
        }
}