package com.Aishwary;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
//            System.out.println(ch);

            series = series + ch; // new objects are being created everytime (because Strings can be modified)
                                    // WASTAGE of memory
        }
        System.out.println(series); //complexity O(N^2)
    }
}
