package com.Aishwary;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1827232;
        int count = 0;

        while (n>0) {
            int rem = n%10;
            if (rem == 2) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
