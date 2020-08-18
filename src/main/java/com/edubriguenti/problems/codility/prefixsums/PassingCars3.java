package com.edubriguenti.problems.codility.prefixsums;

public class PassingCars3 {

    public static int solution(int[] A) {
        int totalPairs = 0;
        int incrementer = 0;
        for (int i = 0; i < A.length; i++) {
            int elem = A[i];
            if (elem == 0) {
                incrementer++;
            } else {
                totalPairs += incrementer;
            }
            if (totalPairs > 1_000_000_000)
                return -1;
        }
        return totalPairs;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[] {0})); // 0
        System.out.println(solution(new int[] {0,0})); // 0
        System.out.println(solution(new int[] {0,1})); // 1
        System.out.println(solution(new int[] {1,0})); // 0
        System.out.println(solution(new int[] {0,1,1})); // 2
        System.out.println(solution(new int[] {0,1,1,1,1,1,1,1})); // 7
        System.out.println(solution(new int[] {0,0,1,1,1,1,1,1,1})); // 14
        System.out.println(solution(new int[] {0,0,1,0,1,1,1,1,1,1})); // 20

    }
}
