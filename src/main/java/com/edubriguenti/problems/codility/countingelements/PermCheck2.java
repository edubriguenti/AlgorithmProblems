package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

public class PermCheck2 {

    public static int solution(int[] A) {
        //Sort the array
        //DO simple calculation to check if the number of elements are right
        //IF they are not right return 0
//        1,2,3 4   4 - (4 -1) -> 1
//        2,3,4 5
//                5 - (array.length -1) -> 2
        Arrays.sort(A);
        int firstElem = A[0];
        int lastElem = A[A.length - 1];
        if (firstElem != 1)
            return 0;
        if (firstElem != lastElem - (A.length - 1)) {
            return 0;
        } else {
            int previousElem = A[0];
            for (int i = 1; i < A.length; i++) {
                int currentElem = A[i];
                if (previousElem == currentElem)
                    return 0;
                previousElem = currentElem;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1_000_000_000}));
        System.out.println(solution(new int[]{1, 2, 4, 4}));
        System.out.println(solution(new int[]{4, 1, 3, 2, 6, 5}));
        System.out.println(solution(new int[]{4, 1, 3, 2}));
    }
}
