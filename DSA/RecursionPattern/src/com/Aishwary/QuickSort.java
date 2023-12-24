package com.Aishwary;

import java.util.Arrays;
import java.util.SortedMap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,9,0,3,1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr); //internal hybrid sorting algorithm
    }
    static void sort(int[] arr, int low, int high){ //Which part are we working on
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end - start)/2;
        int pivot = arr[mid]; //pivot is the mid element value

        while (start <= end){

            //also a reason why, when the array is already sorted it will not swap, unlike merge sort
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){ //then only swap
                int temp = arr[start]; //value of first position element
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //now the pivot is at the correct position, so now sort the two half
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
