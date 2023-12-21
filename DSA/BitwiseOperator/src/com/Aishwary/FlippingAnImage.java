package com.Aishwary;

class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            //reverse the array
            int mid = (image[0].length + 1) / 2;
            for (int i = 0; i < mid; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}