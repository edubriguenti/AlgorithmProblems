package com.edubriguenti.problems.codility.prefixsums;


import java.util.Arrays;

public class GenomicRangeQuery3 {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[] prefixSum = prefixSum(S);

        for(int i = 0; i < P.length; i++) {
            int bottom = P[i];
            int top = Q[i];
            result[i] = lowestImpact(bottom, top, prefixSum);
        }
        return result;
    }

    private static int lowestImpact(int bottom, int top, int[] prefixSum) {
        int lowest = Integer.MAX_VALUE;
        for (int i = bottom; i <= top; i++) {
            int before = 0;
            if (i != 0) {
                before = prefixSum[i - 1];
            }
            int current = prefixSum[i] - before;
            if (current < lowest)
                lowest = current;
        }
        return lowest;
    }

    private static int[] prefixSum(String s) {
        final char[] chars = s.toCharArray();
        int[] prefix = new int[chars.length];
        int firstValue = returnValueOf(chars[0], 0);
        prefix[0] = firstValue;
        for (int i = 1; i < chars.length; i++) {
            prefix[i] = returnValueOf(chars[i], prefix[i-1]);
        }
        return prefix;
    }

    private static int returnValueOf(char aChar, int plus) {
        switch (aChar) {
            case 'A':
                return 1 + plus;
            case 'C':
                return 2 + plus;
            case 'G':
                return 3 + plus;
            case 'T':
                return 4 + plus;
        }
        return 0;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6})));

    }
}
