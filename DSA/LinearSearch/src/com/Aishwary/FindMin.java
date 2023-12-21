package com.Aishwary;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23,41,15,-12,33,6,19};
        System.out.println(min(arr));

    }
    //assume not a empty array
    //return the minimum value from the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<ans){ //minimum   //maximum (arr[i]>ans)
                ans = arr[i];

            }
        }
        return ans;
    }

}
