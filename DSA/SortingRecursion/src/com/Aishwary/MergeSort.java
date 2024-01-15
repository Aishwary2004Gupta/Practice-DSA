package com.Aishwary;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {22,15,12,11,6,9,10};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        //base condition
        if (arr.length == 1){ //if only 1 number remains
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid)); //the original arr is not being sorted
                                                                    //a copy of it is being sorted
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        //merge the left and right sorted parts
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0; // left
        int j = 0; // right
        int k = 0; //merge = left + right

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++; //move ahead as well
        }
        // it can be possible that one of the arr is not completed
        //copy the remaining elements (they will be already sorted)
        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        } // only one of these will run
        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}