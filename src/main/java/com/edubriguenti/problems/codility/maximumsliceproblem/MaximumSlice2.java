package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumSlice2 {

    public static int solution(int[] A) {
        if (A.length == 1)
            return A[0];

        int maxSlice = 0;
        int maxEnding = 0;
        int minValue = 0;

        for (int i = 0; i < A.length; i++) {
            maxEnding += A[i];
            maxSlice = Math.max(maxEnding, maxSlice);
            maxEnding = Math.max(0, maxEnding);
            if (maxEnding == 0) {
                minValue = A[i];
            }
        }
        return maxSlice == 0 ? minValue : maxSlice ;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3,2,-6,4,0}));
        System.out.println(solution(new int[]{-10}));
        System.out.println(solution(new int[]{-10, -2}));

    }


}
