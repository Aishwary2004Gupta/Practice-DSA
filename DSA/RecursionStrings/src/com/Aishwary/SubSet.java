package com.Aishwary;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
    //doing by iteration
    static List<List<Integer>> subset(int[] arr){ //List of list that contains an integer
        //outer list
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); //new empty list has been added

        for (int nums : arr){ //for every number in my arr
            int n = outer.size();
            for (int i = 0; i < n; i++) {       //copy of the list⬇️
                List<Integer> internal = new ArrayList<>(outer.get(i)); //constructor
                internal.add(nums);
                outer.add(internal); //outer list + internal list
            }
        }
        return outer;
    }
}
