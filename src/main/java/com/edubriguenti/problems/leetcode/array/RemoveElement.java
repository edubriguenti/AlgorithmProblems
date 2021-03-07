package com.edubriguenti.problems.leetcode.array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int finalIndex = nums.length - 1;
        int newArraySize = 0;
        for (int i = 0; i <= finalIndex; i++) {
            int currentElem = nums[i];
            if (currentElem == val) {
                for (; finalIndex >= i; finalIndex--) {
                    if (finalIndex == i){
                        newArraySize--;
                        break;
                    }
                    int finalElem = nums[finalIndex];
                    if (finalElem != val) {
                        nums[i] = nums[finalIndex];
                        nums[finalIndex] = val;
                        break;
                    }
                }
            }
            newArraySize++;
        }
        return newArraySize;
    }
}
