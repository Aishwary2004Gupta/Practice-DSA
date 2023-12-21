package com.Aishwary;

public class Shadowing {
    static int x = 90; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
//        int x = 40; //the class variable at line 4 is shadowed by this
        System.out.println(x); // 40
        int x; //declaration
        // System.out.println(x); // Variable 'x' not have been initialized
        x = 40; //initialisation
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}

