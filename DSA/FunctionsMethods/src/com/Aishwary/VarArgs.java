package com.Aishwary;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,7,3,23,67);
//        multiple(2,3,"Aishwary","Rekha");

//        demo(10,23,1,354);
//        demo()
        demo("Aish","Wary");

    }
    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo (String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple (int a, int b, String...v){

    }
    static void fun (int...v){
        System.out.println(Arrays.toString(v));
    }
}
