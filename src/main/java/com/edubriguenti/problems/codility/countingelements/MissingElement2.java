package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

public class MissingElement2 {

    public static int solution(int[] A) {
        Arrays.sort(A);
        int missingElement = 1;
        int previousElement = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (A[i] > missingElement) {
                    return missingElement;
                } else {
                    if (previousElement != A[i])
                        missingElement++;
                    previousElement = A[i];
                }
            }
        }
        return missingElement;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1, -3}));
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
