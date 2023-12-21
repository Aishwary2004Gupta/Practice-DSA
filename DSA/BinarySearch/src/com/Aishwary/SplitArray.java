package com.Aishwary;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //in the end of the loop this will contain the max item from the array
            end = end + nums[i];
        }

        //Apply binary search
        while(start < end) {
//            try for the middle potential answer
            int mid = start + (end - start)/2;

            // calculate in how many peices can you divide this with the max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) { // should not exceed
                    //you cannot add this to this subarray, make new one
                    // say you add this num in the new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num; // after this you will have some pieces
                }
            }
            if (pieces > k) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return end; //here start will be equal to end
    }
}
