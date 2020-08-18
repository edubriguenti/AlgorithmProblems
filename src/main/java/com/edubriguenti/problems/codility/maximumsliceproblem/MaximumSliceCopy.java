package com.edubriguenti.problems.codility.maximumsliceproblem;

public class MaximumSliceCopy {

    public static int solution(int[] A) {
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static int solution2(int[] A) {
        int maxEnding = A[0];
        int maxSlice = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEnding = Math.max(A[i], maxEnding + A[i]);
            maxSlice = Math.max(maxEnding, maxSlice);
        }
        return maxSlice;
    }



    public static void main(String[] args) {

        System.out.println(solution(new int[]{5,-7,3,5,-2,4,-1}));
        System.out.println(solution(new int[]{3,2,-6,4,0}));
        System.out.println(solution(new int[]{-1,-10}));
        System.out.println(solution(new int[]{-10, -2}));

        System.out.println("");


        System.out.println(solution2(new int[]{5,-7,3,5,-2,4,-1}));
        System.out.println(solution2(new int[]{3,2,-6,4,0}));
        System.out.println(solution2(new int[]{-1,-10}));
        System.out.println(solution2(new int[]{-10, -2}));

    }


}
