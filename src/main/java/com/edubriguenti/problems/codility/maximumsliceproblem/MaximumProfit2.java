package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumProfit2 {

    public static int solution(int[] A) {
        if (A.length < 2) {
            return 0;
        }

        int maxProfitSoFar = 0;
        int minPriceSoFar = A[0];

        for (int i = 1; i < A.length; i++) {
            int curElem = A[i];
            if (curElem - minPriceSoFar > maxProfitSoFar) {
                maxProfitSoFar = curElem - minPriceSoFar;
            }
            if (curElem < minPriceSoFar) {
                minPriceSoFar = curElem;
            }
        }

        return maxProfitSoFar;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{23171,21011,21123,21366,21013,21367}));

    }


}
