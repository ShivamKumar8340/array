package com.sunglowsys.oneDArray;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
      /*  int[] a = new int[5];
       a[0] = 1;
        a[1]=2;
        a[2]=34;
        a[3]=4;
        a[4] = 53;*/

        int[] arr = {12, 13, 45, 56};

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        // to get array object name
        String name = arr.getClass().getName();
        System.out.println(name);

       /* for (int s : arr) {
            System.out.println(s);
        }
        System.out.println(Arrays
                .toString(arr));
    }*/

    }
}
