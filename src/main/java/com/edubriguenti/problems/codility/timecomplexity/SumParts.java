package com.edubriguenti.problems.codility.timecomplexity;

public class SumParts {

    public static int solution(int[] A) {
        int minimalDiff = Integer.MAX_VALUE;
        int firstPart = 0;
        int secondPart = 0;
        for (int i = 0; i < A.length; i++) {
            secondPart += A[i];
        }
        for(int i = 0; i < A.length - 1; i++) {
            firstPart += A[i];
            secondPart -= A[i];
            int diff = Math.abs(firstPart - secondPart);
            if(diff < minimalDiff)
                minimalDiff = diff;
        }
        return minimalDiff;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,4,3}));
        System.out.println(solution(new int[]{0,10000,1}));
    }
}
