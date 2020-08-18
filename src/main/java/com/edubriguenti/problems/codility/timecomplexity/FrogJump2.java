package com.edubriguenti.problems.codility.timecomplexity;

public class FrogJump2 {

    public static int solution(int X, int Y, int D) {

        int needToReach = Y - X;
        int jumps = needToReach / D;
        if (needToReach % D == 0) {
            return jumps;
        }

        return jumps + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(0, 111, 10));
    }

}
