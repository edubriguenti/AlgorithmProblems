package com.edubriguenti.problems.leetcode.array;

import java.util.Arrays;

public class MergedSortArray {

    public static void merge(int[] nums1, int numberOfElemArray1, int[] nums2, int numberOfElemArray2) {
        int[] sortedArray = new int[nums1.length];
        int posArray1 = 0, posArray2 = 0;
        while (posArray1 < numberOfElemArray1 && posArray2 < numberOfElemArray2) {
            int elemArray1 = nums1[posArray1];
            int elemArray2 = nums2[posArray2];

            if (elemArray1 < elemArray2) {
                sortedArray[posArray1 + posArray2] = elemArray1;
                posArray1++;
            } else {
                sortedArray[posArray1 + posArray2] = elemArray2;
                posArray2++;
            }
        }
        if (posArray2 < numberOfElemArray2) {
            for (; posArray2 < numberOfElemArray2; posArray2++) {
                sortedArray[posArray1 + posArray2] = nums2[posArray2];
            }
        }

        if (posArray1 < numberOfElemArray1) {
            for (; posArray1 < numberOfElemArray1; posArray1++) {
                sortedArray[posArray1 + posArray2] = nums1[posArray1];
            }
        }

        System.arraycopy(sortedArray, 0, nums1, 0, sortedArray.length);
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,0,0,0};
        merge(array, 3, new int[] {2,5,6}, 3);
        System.out.println(Arrays.toString(array));
    }
}
