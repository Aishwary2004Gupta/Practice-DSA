package com.Aishwary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-4,-1,-12,0,-11};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

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