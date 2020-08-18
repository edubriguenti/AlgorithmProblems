package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumProfit {

    public static int solution(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return 0;
        }
        int minimalBuyingSoFar = A[0];
        int profitSoFar = 0;

        for (int i = 1; i < A.length; i++) {
            minimalBuyingSoFar = Math.min(minimalBuyingSoFar, A[i]);
            profitSoFar = Math.max(profitSoFar, A[i] - minimalBuyingSoFar);
        }

        return profitSoFar;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{23171,21011,21123,21366,21013,21367}));

    }


}
