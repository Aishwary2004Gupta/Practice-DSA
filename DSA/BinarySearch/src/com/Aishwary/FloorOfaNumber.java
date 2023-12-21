package com.Aishwary;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = FloorOfaNumber(arr,target);
        System.out.println(ans);


    }// return the index; biggest number <= target
    static int FloorOfaNumber(int[] arr, int target){

        //but what is the target is less than the smallest element in the array
        // it will return -1 (because end will be = to -1)

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
        return end;
    }
}
