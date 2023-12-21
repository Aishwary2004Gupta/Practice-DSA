package com.Aishwary;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,2,-1,-6};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
//Insertion sort (works very well with partially sorted arrays)
    // comparing with the elements at the left
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) { //j is always greater than 0 and getting reduced (j--)
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break; //arr[j] > arr[j-1] eg:- 1,2,3,4,5 // left side will already be sorted
                }
            }
        }
    }





//selection sort
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the largest element from the array
            //swap it with the correct index
            int last = arr.length - i - 1; //can use (arr.length) but the way to again check with the elements that are in their correct index
            int maxIndex = getMaxIndex(arr, 0 ,last);

            swap(arr, maxIndex,last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    //function for swapping
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


//bubble sort
    static void bubble(int[] arr) { //void because it is not return anything nor making a new array
        // run the spen n-1 times
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, the largest element will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) { //or j <= arr.length - i - 1
                //swap if the iterm is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i
            //the array is sorted
            //stop the program
            if (!swapped){ //not false (swapped) will give true
                break;
            }
        }
    }
}