package com.edubriguenti.problems.codility.array;

import java.util.Arrays;

public class CyclicRotation2 {
    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int pos =  (i + K) % A.length;
            result[pos] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,2,3}, 1)));
    }
}
