package com.Aishwary;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-12,-3,0,2,4,5,12,22,31,34,46,58}; //ascending
        int[] arr = {34,23,22,12,10,8,4,0,-2,-11}; //descending
        int target = 0;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
