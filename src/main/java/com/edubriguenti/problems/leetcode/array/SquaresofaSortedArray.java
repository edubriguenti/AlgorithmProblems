package com.edubriguenti.problems.leetcode.array;

import java.util.Arrays;

class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
