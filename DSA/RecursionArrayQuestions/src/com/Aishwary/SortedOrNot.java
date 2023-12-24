package com.Aishwary;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,3,6,5};
        System.out.println(sorted(arr, 0)); //index = start checking from 0

    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if (index == arr.length - 1){  //-1 because there is no need to check with last element
            return true;               // as there will be no other number to check it with
        }
        return arr[index] < arr[index+1] && sorted(arr, index + 1);
        //same object different references
        //there is nothing like pass by reference in java
        //only pass by the value of the references
    }
}