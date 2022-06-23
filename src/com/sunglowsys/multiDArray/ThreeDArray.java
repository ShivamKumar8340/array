package com.sunglowsys.multiDArray;

public class ThreeDArray {
    public static void main(String[] args) {

        int a[][][] = {{{34,43,45,},{12,22,24,},{21,23,}}};
        for (int i =0;i<a.length;i++) {
            for (int j = 0;j<a[i].length;j++) {
                for (int k = 0;k<a[i][j].length;k++) {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }

        }

    }
}
