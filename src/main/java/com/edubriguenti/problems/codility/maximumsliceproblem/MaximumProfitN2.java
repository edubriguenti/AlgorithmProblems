package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumProfitN2 {

    public static int solution(int[] A) {
        int maxProfit = 0;
        for (int i = 0; i < A.length; i++) {
            int price1 = A[i];
            for (int j = 1; j < A.length; j++) {
                int prince2 = A[j];
                int currentProfit = prince2 - price1;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{23171,21011,21123,21366,21013,21367}));

    }


}
