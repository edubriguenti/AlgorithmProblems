package com.edubriguenti.problems.hackerrank.math;

public class MaximumDraws {

    static int maximumDraws(int n) {
        return n + 1;
    }

    public static void main(String[] args) {
        //Testing
        assert maximumDraws(1) == 2 : "Expected 2";
        assert maximumDraws(2) == 3 : "Expected 3";
        assert maximumDraws(3) == 4 : "Expected 4";
    }
}
