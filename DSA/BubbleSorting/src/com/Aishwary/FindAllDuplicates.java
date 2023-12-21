package com.Aishwary;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //just find missing numbers
        List <Integer> ans = new ArrayList<>(); //List is used because size of answer depends on the missing index.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(arr[index]); //print the element which is at the wrong index after soring the whole arr
            }
        }
        return ans;
    }

    void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
