package com.edubriguenti.problems.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem2 {

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        if (A[0] != 1) {
            return 1;
        }
        int expected = A[0] + 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != expected)
                return expected;
            expected++;
        }
        return expected;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1, 5,4,6,10,8,9}));

    }
}
