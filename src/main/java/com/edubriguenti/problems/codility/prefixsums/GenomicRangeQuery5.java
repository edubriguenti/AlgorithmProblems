package com.edubriguenti.problems.codility.prefixsums;


import java.util.Arrays;

public class GenomicRangeQuery5 {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[][] prefixSum = prefixSum(S);

        for(int i = 0; i < P.length; i++) {
            int bottom = P[i] - 1;
            int top = Q[i];
            int numberOfAs = 0;
            int numberOfCs = 0;
            int numberOfGs = 0;
            int numberOfTs = 0;
            if (bottom < 0) {
                numberOfAs = prefixSum[top][0];
                numberOfCs = prefixSum[top][1];
                numberOfGs = prefixSum[top][2];
                numberOfTs = prefixSum[top][3];
            } else {
                numberOfAs = prefixSum[top][0] - prefixSum[bottom][0];
                numberOfCs = prefixSum[top][1] - prefixSum[bottom][1];
                numberOfGs = prefixSum[top][2] - prefixSum[bottom][2];
                numberOfTs = prefixSum[top][3] - prefixSum[bottom][3];
            }

            if (numberOfAs > 0) {
                result[i] = 1;
            } else if (numberOfCs > 0) {
                result[i] = 2;
            } else if (numberOfGs > 0) {
                result[i] = 3;
            } else if (numberOfTs > 0) {
                result[i] = 4;
            }

        }
        return result;
    }

    private static int[][] prefixSum(String s) {
        final char[] chars = s.toCharArray();
        int[][] prefix = new int[chars.length][4];
        prefix[0][0] = 0; // A
        prefix[0][1] = 0; // C
        prefix[0][2] = 0; // G
        prefix[0][3] = 0; // T
        for (int i = 0; i < chars.length; i++) {
            int previousNumber = 0;
            if (i != 0) {
                previousNumber = i-1;
            }
            prefix[i][0] = returnValueOf(chars[i], prefix[previousNumber][0], 'A');
            prefix[i][1] = returnValueOf(chars[i], prefix[previousNumber][1], 'C');
            prefix[i][2] = returnValueOf(chars[i], prefix[previousNumber][2], 'G');
            prefix[i][3] = returnValueOf(chars[i], prefix[previousNumber][3], 'T');
        }
        return prefix;
    }

    private static int returnValueOf(char aChar, int previousNumber, char currentChar) {
        if (aChar == currentChar) {
            return previousNumber + 1;
        } else {
            return previousNumber;
        }
    }


    public static void main(String[] args) {


        System.out.println(Arrays.toString(solution("AC", new int[] {0,0,1}, new int[] {0,1,1})));
        System.out.println(Arrays.toString(solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6})));
        System.out.println(Arrays.toString(solution("CAGCCTA", new int[] {0,5,4}, new int[] {0,5,5})));

    }
}
