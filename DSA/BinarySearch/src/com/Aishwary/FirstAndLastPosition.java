package com.Aishwary;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
    public static void main(String[] args) {
    }
    //final answer starts from below
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1}; // return if the target is not present the array

        //1. check for first occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    // this function just return the index value of target
    int search (int[] nums, int target, boolean FindFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < nums[mid]) {
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            }else {
                //potential ans found
                ans = mid;
                if (FindFirstIndex) {
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
