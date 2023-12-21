package com.Aishwary;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Aishwary";
        char target = 'g';
//        System.out.println(search(name, target)); //(return true if the char is prensent in the name/ false if not present)
        System.out.println(Arrays.toString(name.toCharArray())); // [A, i, s, h, w, a, r, y]
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()){ // "for each" loop
            if (ch == target){
                return true;
            }
        }
        return false;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
