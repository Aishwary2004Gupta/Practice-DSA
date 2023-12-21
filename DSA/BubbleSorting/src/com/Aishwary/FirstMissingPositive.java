package com.Aishwary;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            //check if the 1st element is at its correct index
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){ //return the missing index
                return index + 1;
            }
        }
        //case 2
        return arr.length + 1; // if all the element are in correct index the N+1
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

