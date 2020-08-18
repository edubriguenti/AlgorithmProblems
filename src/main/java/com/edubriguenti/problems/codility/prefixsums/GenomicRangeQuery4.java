package com.edubriguenti.problems.codility.prefixsums;

public class GenomicRangeQuery4 {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for(int i = 0; i < P.length; i++) {
            int bottom = P[i];
            int top = Q[i];
            int menor = Integer.MAX_VALUE;
            for (int j = bottom; j <= top; j++) {
                char currentChar = S.charAt(j);
                if (currentChar == 'A') {
                    menor = 1;
                    break;
                }
                if (currentChar == 'C' && menor > 2) {
                    menor= 2;
                } else if (currentChar == 'G' && menor > 3) {
                    menor = 3;
                } else if (currentChar == 'T' && menor > 4) {
                    menor = 4;
                }
            }
            result[i] = menor;
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6}));

    }
}
