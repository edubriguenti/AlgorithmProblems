package com.edubriguenti.problems.hackerrank.ds;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }

    static int[] reverseArray(int[] a) {
        int[] reversedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversedArray[i] = a[a.length - i - 1];
        }
        return reversedArray;
    }

}
