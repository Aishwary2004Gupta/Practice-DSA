package com.Aishwary;

public class Comparison {
    public static void main(String[] args) {
        //inside String Pool
        String a = "Aishwary"; //value is same
        String b = "Aishwary";

//        System.out.println(a == b); //true

        //Outside String Pool
        String name1 = new String("Aishwary");//value is same
        String name2 = new String("Aishwary");

//        System.out.println(name1 == name2); // false
//        System.out.println(name1.equals(name2)); // true (only cares about the value)

        System.out.println(name1.charAt(0)); //A (first character of name1)
    }
}
