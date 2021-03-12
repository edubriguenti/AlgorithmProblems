package com.edubriguenti.problems.leetcode.array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int maxValue = -1;
            for (int j = i+1; j < arr.length; j++) {
                int nextElem = arr[j];
                if (nextElem > maxValue) {
                    maxValue = nextElem;
                }
            }
            arr[i] = maxValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }
}
