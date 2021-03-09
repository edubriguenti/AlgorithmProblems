package com.edubriguenti.problems.leetcode.array;

public class CheckIfNAndDoubleExists {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int doubleNum = num * 2;
            boolean hasHalf = num % 2 == 0;
            int halfNum = num / 2;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] == doubleNum || (hasHalf && arr[j] == halfNum)) {
                    return true;
                }
            }
        }
        return false;
    }
}
