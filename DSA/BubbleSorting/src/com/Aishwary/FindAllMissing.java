package com.Aishwary;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google question

import java.util.ArrayList;
import java.util.List;

class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //check if the 1st element is at its correct index
            int correct = nums[i] - 1; // correct index (where the element should be)
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //just find missing numbers
        List <Integer> ans = new ArrayList<>(); //List is used because size of answer depends on the missing index.
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){ //at 0 index the element should be 1 if not it will go inside the if statement
                ans.add(index + 1); //ans = the wrong index + 1 = the missing number
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}