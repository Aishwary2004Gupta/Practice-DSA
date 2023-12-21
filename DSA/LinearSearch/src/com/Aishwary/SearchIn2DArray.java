package com.Aishwary;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {11,23,13,24},
                {-5,26},
                {27,18,-9},
                {22,11,31,1,19}
        };
        int target = 18;
        int[] ans = search(arr,target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1}; //if element is not present
    }

    //Maximum in 2D array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
