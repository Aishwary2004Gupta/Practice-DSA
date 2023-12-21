package com.Aishwary;
//https://leetcode.com/problems/find-the-duplicate-number/
//Finding the duplicate number (there is only 1 duplicate)

class DuplicateNumber {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) { //if the element is not equal to index + 1 -> swap
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++; //otherwise move ahead
            }
            //check if the 1st element is at its correct index
        }
        return -1; //if there are no duplicates
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}