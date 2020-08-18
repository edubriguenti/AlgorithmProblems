package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumSlice {

    public static int solution(int[] A) {
        if (A.length == 1)
            return A[0];

        int maxSlice = 0;
        int maxEnding = 0;
        int minimumValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            maxEnding += A[i];
            if (maxSlice < maxEnding) {
                maxSlice = maxEnding;
            }
            if (maxEnding < 0) {
                minimumValue = Math.max(minimumValue, A[i]);
                maxEnding = 0;
            }
        }
        if (maxSlice == 0) {
            maxSlice = minimumValue;
        }
        return maxSlice;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3,2,-6,4,0}));
        System.out.println(solution(new int[]{-10}));
        System.out.println(solution(new int[]{-10, -2}));

    }


}
