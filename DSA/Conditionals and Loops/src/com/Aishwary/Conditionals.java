package com.Aishwary;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 90000;
        if (salary>100000) {
            salary = salary + 25000;
        } else {
            salary = salary + 20000;
        }

        System.out.println(salary);
    }
}