package com.edubriguenti.problems.codility.primeandcompositenumbers;

public class MinPerimeterRectangle {

    public static int solution(int N) {
        int sideA = 0;
        while (sideA * sideA < N) {
            sideA++;
        }
        System.out.println(sideA);
        int sideB = 1;
        while (sideA * sideB <= N) {
            if (sideA * sideB == N) {
                return 2 * (sideA + sideB);
            }
            sideB++;
        }
        sideA--;
        while (sideA * sideB <= N) {
            if (sideA * sideB == N) {
                return 2 * (sideA + sideB);
            }
            sideB++;
        }
        while (sideA * sideB <= N) {
            if (sideA * sideB == N) {
                return 2 * (sideA + sideB);
            }
            sideB++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(101));
    }
}
