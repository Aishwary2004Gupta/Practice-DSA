package com.Aishwary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {
        //create a array

        int[] arr = {1,2,5,24,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int[] nums){
        nums[0] = 99; //if you make a change to the object via the reference variable, same object will be changed
    }
}
