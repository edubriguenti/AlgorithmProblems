package com.edubriguenti.problems.codility.prefixsums;

public class DivNumber {

    public static int solution(int A, int B, int K) {
        int numberOfDivisibles = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                numberOfDivisibles += (B - i)/K + 1;
                break;
            }
        }
        return numberOfDivisibles;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
        System.out.println(solution(1, 2_000_000_000, 2));
        System.out.println(solution(0, 10, 10));
    }
}
