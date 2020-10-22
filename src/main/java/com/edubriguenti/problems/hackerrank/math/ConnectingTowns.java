package com.edubriguenti.problems.hackerrank.math;

/**
 * https://www.hackerrank.com/challenges/connecting-towns/problem
 */
public class ConnectingTowns {

    static int connectingTowns(int n, int[] routes) {
        int numberOfRoutes = 1;
        for (int i = 0; i < routes.length; i++) {
            numberOfRoutes *= routes[i];
            numberOfRoutes %= 1234567;
        }
        return numberOfRoutes;
    }

    public static void main(String[] args) {
        System.out.println(connectingTowns(3, new int[]{1,3})); //3
        System.out.println(connectingTowns(4, new int[]{2,2,2})); // 8
    }
}
