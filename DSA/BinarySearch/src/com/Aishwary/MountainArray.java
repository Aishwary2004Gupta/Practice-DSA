package com.Aishwary;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

//https://leetcode.com/problems/find-peak-element/

public class MountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
//                you are in the decreasing (descending) part of the array (this may be the answer)
//                but look at left
//                this is why end != mid - 1
                end = mid;
            } else {
//                you are in the increasing (ascending) part of the array
                start = mid +1; // because element[mid + 1] > element[mid]

            }
        }
//        int the end (start == end), and pointing to the largest element, because of the 2 checks made above.
//        start and end are always trying to find the largest element in above 2 checks
//        hence when they are pointing to just one single element, therefore they are pointing to the largest element
        return start; // or return end, as at this point both are pointing to the same element in the array

    }
}
