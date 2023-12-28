package com.Aishwary;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //character value = (97+98) = 195
        System.out.println("a" + "b"); //string = ab
        System.out.println('a' + 3); // (97 + 3) = 100
        System.out.println((char)('a' + 3)); // d

        System.out.println("a" + 1); // ("a" + "1") = a1
        // when a string is concatenated (added with a string) it is converted to its wrapper class Integer
        //NOTE: integer will be converted to Integer that will call toString()

        System.out.println("Aishwary" + new ArrayList<>()); // if something is not in String format
                                                        // java will convert it into string using .toString method
        System.out.println("Aishwary" + new Integer(19));

        System.out.println("a" + 'b'); //if one of the data type is String the answer will be string
        }
}
