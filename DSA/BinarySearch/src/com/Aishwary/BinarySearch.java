package com.Aishwary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-3,0,2,4,5,12,22,31,34,46,58}; //ascending order
        int target = 22;
        int ans= binarySearch(arr,target);
        System.out.println(ans);

    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) { // use equal if the array contains duplicates or not all elements are unique
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
}