package com.edubriguenti.problems.codility.sorting;

import java.util.Arrays;

public class Distinct {


    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0)
            return 0;

        int previous = A[0];
        int distincts = 1;
        for (int current: A) {
            if (current != previous) {
                distincts++;
            }
            previous = current;
        }
        return distincts;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int [] {2,1,1,2,3,1}));
    }
}
