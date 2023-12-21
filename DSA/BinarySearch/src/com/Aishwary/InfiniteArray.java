package com.Aishwary;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(Answer(arr,target));
    }
    static int Answer(int[] arr, int target){
//        1.finding range
//        first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target element to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

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
}
