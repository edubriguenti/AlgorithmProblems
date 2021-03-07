package com.edubriguenti.problems.leetcode.array;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        //when find a duplicate, iterate from that point until find a different one and
        //put the new one in place

        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        int duplicateCheckIndex = 1;
        int uniqueIndex = 0;
        while (duplicateCheckIndex < nums.length) {
            int lastUniqueValue = nums[uniqueIndex];
            for(; duplicateCheckIndex < nums.length ; duplicateCheckIndex++) {
                int duplicateCheckValue = nums[duplicateCheckIndex];
                if (duplicateCheckValue != lastUniqueValue) {
                    nums[++uniqueIndex] = duplicateCheckValue;
                    break;
                }
            }
        }
        return uniqueIndex + 1;
    }
}
