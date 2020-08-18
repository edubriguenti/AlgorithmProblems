package com.edubriguenti.problems.codility.leader;

import java.util.Arrays;

public class Dominator {

    public static int solution(int[] A) {
        //sort the array
        //count the number of ocurrences
        //if it is more then half return
        if (A.length == 0)
            return -1;

        if (A.length == 1)
            return 0;

        final int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(A);
        int currentOcurrences = 1;
        int previousElement = A[0];
        int ocurrencesNecessary = A.length / 2 + 1;
        int dominator = -1;
        for (int i = 1; i < A.length; i++) {
            int currentElement = A[i];
            if (currentElement == previousElement) {
                currentOcurrences++;
            } else {
                previousElement = currentElement;
                currentOcurrences = 1;
            }
            if (currentOcurrences >= ocurrencesNecessary) {
                dominator = A[i];
                break;
            }

        }
        if (dominator != -1) {
            for (int i = 0; i < copy.length; i++) {
                if (copy[i] == dominator)
                    return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1}));
        System.out.println(solution(new int[]{0}));
        System.out.println(solution(new int[]{0,1,1,0,1,1,1,1}));
    }
}
