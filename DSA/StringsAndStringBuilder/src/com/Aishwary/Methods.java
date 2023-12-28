package com.Aishwary;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Aishwary Gupta";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // will not change the original one //makes a new one
        System.out.println(name);
        System.out.println(name.indexOf('w'));
        System.out.println("        Aishwary ".strip()); //remove the while spaces
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
