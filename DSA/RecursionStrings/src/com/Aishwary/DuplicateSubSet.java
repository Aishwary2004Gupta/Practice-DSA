package com.Aishwary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubSet {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        //Sort the array (so that the duplicates are together)
        Arrays.sort(arr); //In build sorting

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++){
            start = 0;
            // but if the current and previous elements is same, then s = e+1
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1; //new start will be previous end + 1
            }
            end = outer.size() - 1; // new end is equal to length of the last element
                  //length of the entire array

            int n = outer.size();
            for (int j = start; j < n; j++) {       //copy of the list⬇️
                List<Integer> internal = new ArrayList<>(outer.get(j)); //constructor
                internal.add(arr[i]);
                outer.add(internal); //outer list + internal list
            }
        }
        return outer;
    }
}
