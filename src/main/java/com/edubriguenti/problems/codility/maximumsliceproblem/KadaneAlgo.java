package com.edubriguenti.problems.codility.maximumsliceproblem;

public class KadaneAlgo {

    private static int maxSlice(int[] array) {
        int maxSlice = 0;
        int maxEnding = 0;

        for (int i = 0; i < array.length; i++) {
            maxEnding += array[i];
            if (maxSlice < maxEnding) {
                maxSlice = maxEnding;
            }
            if (maxEnding < 0) {
                maxEnding = 0;
            }
        }
        return maxSlice;
    }

    public static void main(String[] args) {
        System.out.println(maxSlice(new int[] {4, 2, -50, 3, 4, 5 }));
    }
}
