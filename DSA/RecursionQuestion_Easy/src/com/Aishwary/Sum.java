package com.Aishwary;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n <= 1){ //base condition
            return 1; //if it is 0 then also it will return 1
        }

        return n + sum(n - 1);
    }
}
