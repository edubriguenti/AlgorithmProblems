package com.edubriguenti.problems.leetcode;

public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentMaxConsecutives = 0;
        int maxConsecutives = 0;
        for (int elem : nums) {
            if (elem == 1) {
                currentMaxConsecutives++;
                if (currentMaxConsecutives > maxConsecutives) {
                    maxConsecutives = currentMaxConsecutives;
                }
            } else {
                currentMaxConsecutives = 0;
            }
        }
        return maxConsecutives;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 2, 3}));
    }
}
