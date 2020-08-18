package com.edubriguenti.problems.codility.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    private static class Circle {
        long left;
        long right;
        Circle(long left, long right){
            this.left = left;
            this.right = right;
        }
    }

    public static int solution(int[] A) {
        long[] openDisks = new long[A.length];
        long[] closeDisks = new long[A.length];

        for(int i = 0; i < A.length; i++) {
            openDisks[i] = i - (long)A[i];
            closeDisks[i] = i + (long)A[i];
        }

        Arrays.sort(openDisks);
        Arrays.sort(closeDisks);

        int numberOfIntersections = 0;
        int numberOfOpens = 0;
        int currentOpenPos = 0;
        int currentClosedPos = 0;
        for(int i = currentOpenPos; currentOpenPos < openDisks.length;) {
            if (openDisks[currentOpenPos] <= closeDisks[currentClosedPos]) {
                numberOfIntersections += numberOfOpens;
                numberOfOpens += 1;
                currentOpenPos++;
            } else {
                numberOfOpens--;
                currentClosedPos++;
            }
            if (numberOfIntersections > 10_000_000)
                return -1;
        }
        return numberOfIntersections;
    }

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{0,1})); // 1
//        System.out.println(solution(new int[]{5,1})); // 1
//        System.out.println(solution(new int[]{0,1,1})); // 2
//        System.out.println(solution(new int[]{0,1,0})); // 2
//        System.out.println(solution(new int[]{1,5,2,1,4,0})); // 11
        System.out.println(solution(new int[]{1,2147483647,0})); // 2
    }
}
