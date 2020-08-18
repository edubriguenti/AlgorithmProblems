package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

public class FrogRiver3 {

    public static int solution(int X, int[] A) {
        boolean[] path = new boolean[X+1];
        for (int i = 0; i < A.length; i++) {
            int leafPos = A[i];
            System.out.println(leafPos);
            if (leafPos < path.length && !path[leafPos]) {
                path[leafPos] = true;
                X--;
            }
            System.out.println(Arrays.toString(path));
            if (X <= 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 1, 4, 8, 3, 5, 4}));
    }
}
