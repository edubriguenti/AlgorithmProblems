package com.edubriguenti.problems.hackerrank.math;

/**
 * https://www.hackerrank.com/challenges/restaurant/problem
 */
public class Restaurant {

    static int restaurant(int l, int b) {
        int numberOfPiecesWithNoRest = (int)((l * b) / Math.pow(gcd(l, b), 2));
        return numberOfPiecesWithNoRest;
    }

    static int gcd(int l, int b){
        int gcd = 1;
        for (int i = 1; i <= l && i <= b; i++) {
            if (l % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }



    public static void main(String[] args) {
        System.out.println(restaurant(2, 2)); // 1
        System.out.println(restaurant(6, 9)); // 6
    }
}
