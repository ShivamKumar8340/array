package com.sunglowsys.oneDArray;

public class MinArrayExample {
    public static void min(int arr[]) {
        int min = arr[0];
        for (int i =1;i<arr.length;i++) {
            if (min>arr[i]) {
                min=arr[i];
            }

        }System.out.println("min array is :" +min);
    }

    public static void main(String[] args) {
        int[] a = {12,13,23,1,2};
        min(a);
    }
}
