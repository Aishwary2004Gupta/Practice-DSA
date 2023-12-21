package com.Aishwary;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {1, 11, 23, 13, 53, 21, 7};
//        swap(arr,0,5); // index[0] will be swapped by index[5]

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }

    //reverse the array (two pointer method)

    static void reverse (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }

}
