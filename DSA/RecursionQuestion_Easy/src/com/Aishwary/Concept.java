package com.Aishwary;

public class Concept {
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--);  // gives error
        concept(--n);
    }
}
