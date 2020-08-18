package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

public class MaxCounters {


    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int allCounters = 0;
        for(int i = 0; i < A.length; i++) {
            int currentCounter = A[i] - 1;
            if (currentCounter == N) {
                allCounters = maxCounter;
            } else {
                if (counters[currentCounter] < allCounters)
                    counters[currentCounter] = allCounters;
                counters[currentCounter]++;
                if (counters[currentCounter] > maxCounter)
                    maxCounter = counters[currentCounter];
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < allCounters)
                counters[i] = allCounters;
        }
        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3,4,4,6,1,4,4})));
    }
}
