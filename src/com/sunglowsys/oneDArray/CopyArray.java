package com.sunglowsys.oneDArray;

public class CopyArray {
    public static void main(String[] args) {
        char[] copyFrom ={'h','i','s','h','i','v','a','m','k','s'};

        char[] copyTo = new char[11];

        // to copy an array call arrayCopy()  of System class
        System.arraycopy(copyFrom,2,copyTo,5,6);
        System.out.println(String.valueOf(copyTo));
    }
}
