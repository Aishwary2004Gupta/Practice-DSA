package com.Aishwary;

import java.util.ArrayList;

public class CountPermutations {
    public static void main(String[] args) {
        System.out.println(permutationsCount("", "abcd"));
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) { //when unprocessed is empty return 1
            return 1;
        }
        int count = 0;

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationsCount(first + ch + second, up.substring(1));//skip first ch
        }
        return count;
    }

}
