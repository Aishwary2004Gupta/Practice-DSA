package com.Aishwary;

public class Reverse {
    static int sum = 0; // not purely recursion (taking a variable outside the main rev func)
    static void rev(int n){ //when you are not return anything just using what is already available
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem; //last digit will print first (jumping positions)
        rev(n / 10);
    }

    public static void main(String[] args) {
        rev(1653);
        System.out.println(sum);
    }
}
