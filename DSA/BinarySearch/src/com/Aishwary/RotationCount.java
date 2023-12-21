package com.Aishwary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) { //just two lines to find the rotation count.
        int pivot = findPivot(arr);
            return pivot + 1;
        } // it will return 0 if the array is already sorted (not rotated)

    //use this for non duplicates
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


    // use this for duplicate
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
