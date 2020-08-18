package com.edubriguenti.problems.codility.primeandcompositenumbers;

public class CountFactors {

    /**
     * O(N)
     * @param N
     * @return
     */
    public static int solution(int N) {
        if (N == 1)
            return 1;
        int count = 2;
        int i = 2;
        while (i < N) {
            if (N % i == 0 && i <= N/2) {
                count++;
            }
            i++;
        }
        return count;
    }

    /**
     * O (SquareRootN)
     * @param N
     * @return
     */
    public static int solution2(int N) {
        if (N == 1)
            return 1;
        int count = 0;
        long i = 1;
        while (i * i < N) {
            if (N % i == 0) {
                count+=2;
            }
            i++;
        }
        if (i * i == N) {
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution2(24));
        System.out.println(solution2(23));
        System.out.println(solution2(1));
        System.out.println(solution2(2));
        System.out.println(solution2(3));
        System.out.println(solution2(4));
        System.out.println(solution2(2147483647));
    }
}
