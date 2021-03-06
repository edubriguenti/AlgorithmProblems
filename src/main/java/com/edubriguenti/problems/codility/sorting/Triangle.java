package com.edubriguenti.problems.codility.sorting;

import java.util.Arrays;

public class Triangle {

    public static int solution(int[] A){
        Arrays.sort(A);

        for (int i=0; i < A.length - 2; i++) {
            long first = A[i];
            long second = A[i+1];
            long third = A[i+2];
            if (first + second > third){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 2, 5, 1, 8, 20}));
        System.out.println(solution(new int[]{10, 50, 5, 1}));
        System.out.println(solution(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));



    }

}
