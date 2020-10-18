package com.edubriguenti.problems.hackerrank.math;

public class MinimumHeightTriangle2 {
    static int lowestTriangle(int base, int area){
        double h = (2.0 * area) / base;
        return (int)Math.ceil(h);
    }

    public static void main(String[] args) {
        System.out.println(lowestTriangle(17, 100));
        System.out.println(lowestTriangle(1000000, 1));
        System.out.println(lowestTriangle(1, 1));
    }
}
