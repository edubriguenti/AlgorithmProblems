package com.edubriguenti.problems.codility.array;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        if (A.length == 1)
            return A[0];
        Arrays.sort(A);
        int previousElem = A[0];
        for (int i = 1; i < A.length; i++) {
            int current = A[i];
            if (current != previousElem) {
                return previousElem;
            }
            previousElem = A[++i];
        }
        return previousElem;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(solution(new int[]{5}));
        System.out.println(solution(new int[]{1,1,6}));
        System.out.println(solution(new int[]{1,1,1,1,6}));
    }
}
