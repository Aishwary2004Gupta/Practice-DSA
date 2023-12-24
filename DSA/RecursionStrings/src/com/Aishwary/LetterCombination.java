package com.Aishwary;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
//        phonePad("", "12");
        System.out.println(phonePadArray("", "18"));
//        System.out.println(phonePadCount("", "29"));
    }

    static void phonePad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // to convert character to digit
        // this will convert "2" into 2
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);

            phonePad(p + ch, up.substring(1));
            //substring creates a new object
        }
    }

    //Adding the answer to Arraylist
    static ArrayList<String> phonePadArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);

            ans.addAll(phonePadArray(p + ch, up.substring(1)));
            //substring creates a new object
        }
        return ans;
    }


    //Count
    static int phonePadCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);

            count = count + phonePadCount(p + ch, up.substring(1));
            //substring creates a new object
        }
        return count;
    }
}
