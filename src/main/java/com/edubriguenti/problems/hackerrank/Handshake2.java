package com.edubriguenti.problems.hackerrank;

public class Handshake2 {

    static int handshake(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
    //Testing
        assert handshake(1) == 0 : "Expected 0";
        assert handshake(2) == 1 : "Expected 1";
        assert handshake(3) == 3 : "Expected 3";

    }
}
