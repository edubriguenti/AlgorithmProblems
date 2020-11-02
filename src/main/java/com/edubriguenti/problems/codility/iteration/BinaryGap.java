package com.edubriguenti.problems.codility.iteration;

/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
public class BinaryGap {

    public static int solution(int N) {
        //go thru the binary string and count zeros between ones
        final String bString = Integer.toBinaryString(N);
        int currentNumberOfZeros = 0;
        int maxNumberOfZeros = 0;
        boolean openGap = false;
        for (int i = 0; i < bString.length(); i++) {
            char currentChar = bString.charAt(i);
            if (currentChar == '0' && openGap) {
                currentNumberOfZeros++;
            } else if (currentChar == '1') {
                if (openGap) {
                    if (currentNumberOfZeros > maxNumberOfZeros) {
                        maxNumberOfZeros = currentNumberOfZeros;
                    }
                    currentNumberOfZeros = 0;
                } else {
                    openGap = true;
                }
            }
        }
        return maxNumberOfZeros;
    }

    public static void main(String[] args) {

        System.out.println(solution(9)); // 2
        System.out.println(solution(529)); // 4
        System.out.println(solution(20)); // 1
        System.out.println(solution(15)); // 0
        System.out.println(solution(32)); // 0
        System.out.println(solution(561892)); // 3

    }
}
