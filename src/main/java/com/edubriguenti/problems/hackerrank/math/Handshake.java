package com.edubriguenti.problems.hackerrank.math;

public class Handshake {

    static int handshake(int n) {
        if (n <= 1)
            return 0;
        if (n == 2) {
            return 1;
        }
        return handshake(n - 1) + (n - 1);
    }

    public static void main(String[] args) {

        assert handshake(1) == 0 : "Expected 0";
        assert handshake(2) == 1 : "Expected 1";
        assert handshake(3) == 3 : "Expected 3";

    }
}
