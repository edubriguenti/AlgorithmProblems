package com.edubriguenti.problems.hackerrank.math;

/**
 * https://www.hackerrank.com/challenges/game-with-cells/problem
 */
public class ArmyGame {


    static int gameWithCells(int n, int m) {
        int n1 = n / 2, m1 = m / 2;
        int numberOfDrops = n1 * m1;
        if (n % 2 == 0 && m % 2 == 0) {
            numberOfDrops = numberOfDrops;
        } else if (n % 2 == 1 && m % 2 == 0) {
            numberOfDrops += m / 2;
        } else if ((n % 2 == 0 && m % 2 == 1)) {
            numberOfDrops += n / 2;
        } else {
            numberOfDrops += n / 2 + m / 2 + 1;
        }
        return numberOfDrops;
    }

    public static void main(String[] args) {
        System.out.println(gameWithCells(2, 2));
        System.out.println(gameWithCells(4, 4));
        System.out.println(gameWithCells(1, 4));
        System.out.println(gameWithCells(3, 3));
        System.out.println(gameWithCells(5, 5));
    }
}
