package com.Aishwary;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruits = in.next();
//
//        switch (fruits) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Red colour fruit");
//            case "Grape" -> System.out.println("Juicy fruit");
//            default -> System.out.println("Enter a valid fruit");
//        }

        int days = in.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a day of a week");
                break;
        }

    }
}