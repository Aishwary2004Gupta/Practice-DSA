package com.Aishwary;
//https://leetcode.com/problems/set-mismatch/

class MissingAndDuplicate {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            //check if the 1st element is at its correct index
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){ //return the missing index
                return new int[] {nums[index], index + 1}; //{duplicate, missing}
            }
        }
        //case 2
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
