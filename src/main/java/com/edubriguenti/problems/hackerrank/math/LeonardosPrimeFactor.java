package com.edubriguenti.problems.hackerrank.math;

import java.math.BigInteger;

/**
 *  https://www.hackerrank.com/challenges/leonardo-and-prime/problem
 */
public class LeonardosPrimeFactor {

    static int primeCount(long n) {
        int numberOfPrimeFactors = 0;
        BigInteger multiplication = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                multiplication = multiplication.multiply(BigInteger.valueOf(i));
                if (multiplication.compareTo(BigInteger.valueOf(n)) <= 0) {
                    numberOfPrimeFactors++;
                } else {
                    break;
                }
            }
        }

        return numberOfPrimeFactors;
    }

    private static boolean isPrime(int numero) {

        if (numero == 1)
            return false;

        if (numero == 2)
            return true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(primeCount(1)); // 0
        System.out.println(primeCount(2)); // 1
        System.out.println(primeCount(3)); // 1
        System.out.println(primeCount(500)); // 4
        System.out.println(primeCount(5000)); // 5
        System.out.println(primeCount(10000000000L)); // 10
        System.out.println(primeCount(614889782588491410L)); // 15
    }
}
