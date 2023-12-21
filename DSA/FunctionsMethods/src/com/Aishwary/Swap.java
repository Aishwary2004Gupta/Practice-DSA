package com.Aishwary;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //print swap of two numbers

//        int temp = a;
//        a = b;
//        b = temp;

        swap (a,b);
        System.out.println(a + " " + b);

        String name = "Aishwary";
        ChangeName(name);
        System.out.println(name);
    }
    static void ChangeName(String naam) {
        naam = "Barkha"; //creating a new object
    }

    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        //this changes will only be vaild in function scope only
    }
}
