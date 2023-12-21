package com.Aishwary;
//https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {

    }
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
// try to search is 2nd half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start)/2;
                if (arr[mid] > arr[mid+1]) {
                    end = mid;
                } else {
                    start = mid +1; // because element[mid + 1] > element[mid]
                }
            }
            return start;
        }



    static int orderAgnosticBS (int[] arr, int target, int start, int end) {
//        find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end){
            //find the middle element
//            int mid = (start + end) /2; // integer has a fix size
            // might be possible that (start+end) extend the range of int in java
            int mid = start + (end-start)/2; // formula for finding the middle element

            if (arr[mid] == target){
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]){
                    end  = mid-1;
                }
                else { //(target > arr[mid])
                    start = mid+1;
                }
            }
            else{      //is descending
                if (target > arr[mid]){
                    end  = mid-1;
                }
                else{  //(target < arr[mid])
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
