package com.Aishwary;

public class Overloading {
    public static void main(String[] args) {
//        func(90);
//        func("Aishwary Gupta");
//        int ans = sum(30,15);
        int ans = sum(10,20,15);
        System.out.println(ans);

    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void func(int a) {
        System.out.println("First");
        System.out.println(a);

    }
    static void func(String name) {
        System.out.println("Second");
        System.out.println(name);

    }
}
