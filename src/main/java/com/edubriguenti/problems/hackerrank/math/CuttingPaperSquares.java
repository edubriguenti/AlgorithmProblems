package com.edubriguenti.problems.hackerrank.math;

/**
 * https://www.hackerrank.com/challenges/p1-paper-cutting/problem
 */
public class CuttingPaperSquares {

    // Complete the solve function below.
    static long solve(int n, int m) {
        return (long)m * (long)n  - 1;
    }


    public static void main(String[] args) {
        System.out.println(solve(3,1)); // 2
        System.out.println(solve(3,2)); // 5
        System.out.println(solve(12,12)); // 143
    }
}
