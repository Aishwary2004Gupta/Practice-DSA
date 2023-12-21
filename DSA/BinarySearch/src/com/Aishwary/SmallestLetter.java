package com.Aishwary;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {'c','f','j'};
        int target = 'c';
        int ans = nextGreatestLetter(arr,target);
        System.out.println(ans);


    } //return the index: smallest number >= target
    static int nextGreatestLetter(int[] letters, int target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {

            int mid = start + (end-start)/2;

            if (target < letters[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
