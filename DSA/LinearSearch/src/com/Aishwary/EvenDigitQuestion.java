package com.Aishwary;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitQuestion {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        System.out.println(digits2(-52110));


    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }
//function to check whether the digit contains even number of digits
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        //even or not

        /*
        if(numberOfDigits % 2 == 0){ //even or not
            return true;
        }
        return false;
         */

        return numberOfDigits % 2 == 0;
    }
    static int digits2 (int nums){

        if (nums<0){ //for negative numbers
            nums = nums*-1;
        }

        return (int) (Math.log10(nums)+1); //find number of digits
    }

//count the number of digits
    static int digits(int num) {

        if (num<0){ //for negative numbers
            num = num*-1;
        }

        if (num==0) {
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count;
    }
}
