package com.edubriguenti.problems.codility.primeandcompositenumbers;

public class MinPerimeterRectangle2 {

    public static int solution(int N) {
        int minPerimeter = 0;
        for (int i = (int)Math.sqrt(N); i > 0; i--) {
            if (N % i == 0) {
                minPerimeter = 2 * (i + N/i);
                break;
            }
        }
        return minPerimeter;
    }

    public static void main(String[] args) {
        System.out.println(solution(101));
    }
}
