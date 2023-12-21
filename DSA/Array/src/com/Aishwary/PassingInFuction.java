package com.Aishwary;

import java.util.Arrays;

public class PassingInFuction {
    public static void main(String[] args) {
        int[] num = {1, 3, 34, 21};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change (int[] arr){
        arr[0] = 99;
    }
}
