package com.edubriguenti.problems.codility.prefixsums;

/**
 * Trying to do this TDD style
 */
public class PassingCars2 {

    public static int solution(int[] A) {
        int totalPairs = 0;
        int increment = 0;
        if (A.length < 2)
            return 0;
        for (int i = 0; i < A.length; i++) {
            int currentCar = A[i];
            if (currentCar == 0){
                increment++;
            } else {
                totalPairs += increment;
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[] {0})); // 0
        System.out.println(solution(new int[] {0,0})); // 0
        System.out.println(solution(new int[] {0,1})); // 1
        System.out.println(solution(new int[] {1,0})); // 0
        System.out.println(solution(new int[] {0,1,1})); // 2

    }
}
