package com.edubriguenti.problems.hackerrank.math;

import java.math.BigDecimal;

public class MinimumHeightTriangle {
    static int lowestTriangle(int base, int area){
        // long area = base * h / 2
        double h = (double)area * 2 / base;
        return (int) Math.ceil(h);
    }

    public static void main(String[] args) {
        System.out.println(lowestTriangle(17, 100));
        System.out.println(lowestTriangle(1000000, 1));
        System.out.println(lowestTriangle(1, 1));
    }
}
