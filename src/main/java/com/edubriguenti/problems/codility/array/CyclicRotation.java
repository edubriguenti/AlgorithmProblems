package com.edubriguenti.problems.codility.array;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class CyclicRotation {



    public static int[] solution2(int[] A, int K) {
        int numberOfMoviments = K;
        int[] result = new int[A.length];
        if (K >= A.length) {
            numberOfMoviments = A.length % K;
        }
        if (numberOfMoviments == 0) {
            return A;
        }
        for (int i = 0; i<A.length; i++) {
            if (i == A.length - 1) {
                result[numberOfMoviments-1] = A[i];
            } else {
                result[numberOfMoviments+i] = A[i];
            }
        }
        return result;

    }

    public static int[] solution(int[] A, int K) {
        int size = A.length;
        int[] returnArray = new int[size];
        for(int i = 0; i < size; i++) {
            int pos = (i + K) % size;
            returnArray[pos] = A[i];
        }
        return returnArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4))); //1,2,3,4
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 1))); //4,1,2,3
    }
}
