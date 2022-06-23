package com.sunglowsys.multiDArray;

// this is an zagged array
public class TwoDZaggedArray {
    public static void main(String[] args) {

        // also we can declare an 2D array like this

        /*int[][] arr; // declaration
        arr = new int[3][];  //creation
        arr[0]=new int[3];
        arr[1] = new int[4];
        arr[2]=new int[1];
        // intialization
        arr[0][1]=2;*/
        int[][] arr = {
                {1, 4, 32},
                {43, 44, 23, 33},
                {2},
        };

        System.out.println("length of array :"+arr.length);
        // see the output
        //when we print only arr
        System.out.println("when we print only arr :"+arr);
        System.out.println("when we print only arr[0] :"+arr[0]);
        System.out.println("when we print only arr[0] :"+arr[0][2]);
        System.out.println("when we print only arr[0] length then we found column length :"+arr[0].length);
        System.out.println("when we print only arr[0] :"+arr[0][0]);
       //blow  Sop  show error
        // System.out.println("when we print only arr[0] :"+arr[0][1].lenth);
        for (int i =0;i<arr.length;i++) {
          // System.out.println("length of arr[i] : "+arr[i].length);
            for (int j =0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");

            }System.out.println();
        }
    }
}
