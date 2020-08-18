package com.edubriguenti.problems.codility.prefixsums;

public class MinAvgTwoSlice2 {

    public static int solution(int[] A) {
        int minPos = -1;
        double minValue = Double.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + A[i + 1]) / 2.0 < minValue) {
                minPos = i;
                minValue = (A[i] + A[i + 1]) / 2.0;
            }
            if (i < A.length - 2 && (A[i] + A[i + 1] + A[i + 2]) / 3.0 < minValue) {
                minPos = i;
                minValue = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            }
        }
        return minPos;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
        System.out.println(solution(new int[]{-1, 1, -10, -1, -1, -3, -1}));
        System.out.println(solution(new int[]{-3, -5, -8, -4, -10}));
    }
}
