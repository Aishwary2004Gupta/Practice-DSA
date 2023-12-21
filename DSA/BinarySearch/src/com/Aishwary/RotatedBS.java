package com.Aishwary;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,7,0,1,2};
        System.out.println(findPivot(arr));

    }

    static int search(int[] nums, int target) {
//        int pivot = findPivot(nums);
        int pivot = findPivotWithDuplicates(nums);

        //if you did not find the pivot that means the array is not rotated
        if (pivot == -1){
            // just run normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);

        }
        // if pivot is found, you have found 2 ascending sorted arrays
        // 3 cases
        if (nums[pivot] == target) {
            return pivot;
        } else if (target > nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }else {
            return binarySearch(nums, target, pivot+1, nums.length -1);
        }

    }


    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end) {
            //find the middle element
//            int mid = (start + end) /2; // integer has a fix size
            // might be possible that (start+end) extend the range of int in java
            int mid = start + (end-start)/2;

            if (target < arr[mid]){ //target less than the mid element
                end  = mid-1;
            }
            else if (target > arr[mid]){ //target greater than the mid element
                start = mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }


    // this will ot work in duplicate value
    static int findPivot (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    // this will not work in duplicate value
    static int findPivotWithDuplicates (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // if elements at middle, start, and end are equal than just skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates as they cannot be the pivot (the single largest number in th array)

                //NOTE: what if these start and end were the pivots??
                //check if the start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check if the end is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted
            // so pivot should be at right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
