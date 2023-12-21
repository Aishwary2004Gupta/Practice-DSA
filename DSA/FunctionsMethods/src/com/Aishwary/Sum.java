package com.Aishwary;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum1();
//        System.out.println(ans);

        int ans = sum2(20,30);
        System.out.println(ans);
    }
    //pass the value of numbers when you are calling the method in main()
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Return the value

    static int sum1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

        // System.out.println("This will never execute");
    }

//    static void sum() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum = " + sum);
    }

