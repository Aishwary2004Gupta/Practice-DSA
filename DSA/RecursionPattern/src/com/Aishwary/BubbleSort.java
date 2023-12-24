package com.Aishwary;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,0,-2,-5};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[col+1]){ //i = row, j = col
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row, col+1); //move forward in col
        }else { //otherwise start the col from 0 of next row
            bubbleSort(arr, row-1, 0); // next row, start from col 0
        }
    }
}
