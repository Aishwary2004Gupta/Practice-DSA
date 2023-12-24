package com.Aishwary;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10,10,13,14};
//        System.out.println(find(arr,10,0));
//        System.out.println(findIndex(arr,10,0));
//        System.out.println(findIndexFromLast(arr,10, arr.length - 1));

//        findAllIndex(arr,10,0);
//        System.out.println(list);

//        System.out.println(findAllIndex(arr, 10, 0, new ArrayList<>()));

        System.out.println(findAllIndex2(arr, 10, 0));
    }

    //return true or false
    static boolean find(int[] arr, int target, int index){
        //base condition
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
        //return type boolean
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //return index value of the target
    static int findIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //return index value from the back
    static int findIndexFromLast(int[] arr, int target, int index) {
        //base condition
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexFromLast(arr, target, index - 1); //in place of i + 1
            //return type int
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //find all indexes
    static ArrayList<Integer> list = new ArrayList<>(); //creating list outside the function
    static void findAllIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) { //if you find the TARGET save it in the list and move forward
            list.add(index); //not returning the ans // just adding it in the ArrayList
        }
        findAllIndex(arr, target, index + 1); //calling rest of the array
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //find all the indexes but do not create a list outside the function
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        //base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list); //return type ArrayList
    }
    //list are just different reference variables pointing to the 'same' object
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //return the list without adding it in the argument (parameter)
    //not very optimised
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        //create a ArrayList at every function call
        ArrayList<Integer>list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index + 1);

        //VVVI line
        list.addAll(ansFromBelowCalls); //whatever answer you got from below
                                        // just add it will all the answers that you have gotten till now
        return list; //now list contains all the answers that you have got till now, just return it
    }
}
