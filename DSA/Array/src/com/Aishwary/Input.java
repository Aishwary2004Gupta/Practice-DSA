package com.Aishwary;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // array of primitives
        arr[0] = 15;
        arr[1] = 9;
        arr[2] = 90;
        arr[3] = 81;
        arr[4] = 2;
        
        // [15, 9, 90, 81, 2] //stored internally
//        System.out.println(arr[2]); 
        //input using for loop

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(arr[5]); //Index out of bound error

        //Array of objects (String)

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            
        }
        System.out.println(Arrays.toString(str));

//        modify
        str[1] = "Aishwary";
        System.out.println(Arrays.toString(str));

    }
}
