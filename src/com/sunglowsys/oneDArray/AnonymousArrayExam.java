package com.sunglowsys.oneDArray;

import java.sql.Array;

public class AnonymousArrayExam {
    static void printArray(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{31,34,23,44});
    }
}
