package com.Aishwary;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sortInPlace(int[] arr, int s, int e){
        //base condition
        if (e-s == 1){ //arr.length = e-s
            return;
        }

        int mid = s + (e - s)/2;

        sortInPlace(arr, s, mid); //original arr is being sorted //thats why inPlace
        sortInPlace(arr, mid, e);

        //merge the left and right sorted parts
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s; // left
        int j = m; // right
        int k = 0; //merge = left + right

        while(i < m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++; //move ahead as well
        }
        // it can be possible that one of the arr is not completed
        //copy the remaining elements (as they will be already sorted)
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        } // only one of these will run
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
