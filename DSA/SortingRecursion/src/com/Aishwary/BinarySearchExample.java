package com.Aishwary;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {-8, -2, 0, 10, 20, 30, 40, 50};
        int[] arr1 = {50, 40, 30, 20, 10, 0, -2, -8}; //descending
        System.out.println(BS(arr, 0 ));
    }
    static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){ //if the array consists of 0 "<=" if not "<" only
            int mid = start + (end - start)/2; //This will not exceed the range
            if (target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;  //target < arr[mid]
            }
        }
        return -1; //if element not found
    }
}
