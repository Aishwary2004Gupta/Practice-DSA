package com.Aishwary;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,0,-2,-5}; //works for unsorted array as well
        selectionSort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int row, int col, int max){ //max = index
        if (row == 0){
            return;
        }

        if (col < row){
            if (arr[col] > arr[max]) { //element
                selectionSort(arr, row, col+1, col); //max will be equal to col
            }else {
                selectionSort(arr, row, col + 1, max);
            } //now there is a maximum
        }else { //col == row, go to next row
            int temp = arr[max];
            arr[max] = arr[row-1]; //last element in that row
            arr[row-1] = temp;

            selectionSort(arr,row - 1, 0,0); //max = 0th index
        }
    }
}
