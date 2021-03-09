package com.edubriguenti.problems.leetcode.array;

public class ValidMontainArray {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        if (arr[0] > arr[1])
            return false;

        int previousElem = arr[0];
        boolean goingUp = true;
        for (int i = 1; i < arr.length; i++) {
            int currentElem = arr[i];
            if (goingUp) {
                if (previousElem == currentElem) {
                    return false;
                } else if (previousElem > currentElem) {
                    goingUp = false;
                }
            } else {
                if (previousElem == currentElem) {
                    return false;
                } else if (previousElem < currentElem) {
                    return false;
                }
            }
            previousElem = currentElem;
        }

        return !goingUp;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
    }
}
