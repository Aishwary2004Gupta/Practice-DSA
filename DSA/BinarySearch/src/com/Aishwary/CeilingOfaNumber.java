package com.Aishwary;

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        int ans = CeilingOfaNumber(arr,target);
        System.out.println(ans);


    } //return the index: smallest number >= target
    static int CeilingOfaNumber (int[] arr, int target){

        //but what if the target is greater than the greatest element in the array
        if (target > arr.length - 1){
            return -1; //no answer exists for that
        }

        int start = 0;
        int end = arr.length - 1;



        while(start <= end) {

            int mid = start + (end-start)/2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
