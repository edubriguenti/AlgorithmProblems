package com.edubriguenti.problems.codility.primeandcompositenumbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public static int solution(int[] A) {
        //get Index of each peak
        //save the maximum distance of each peak
        //iterate the peak list counting how many flags
        if (A.length == 1)
            return 1;

        if (A.length == 2)
            return 0;

        List<Integer> listOfPeaks  = new ArrayList<>();
        int maxDistanceOfPeak = -1;
        for (int i = 1; i < A.length - 1; i++) {
            int currentElem = A[i];
            if (currentElem > A[i-1] && currentElem > A[i+1]) {
                if (listOfPeaks.size() > 0) {
                    int previousPeakIndex = listOfPeaks.get(listOfPeaks.size() - 1);
                    int distance = i - previousPeakIndex;
                    if (distance > maxDistanceOfPeak) {
                        maxDistanceOfPeak = distance;
                    }
                }
                listOfPeaks.add(i);
            }
        }
        System.out.println(listOfPeaks);
        System.out.println(maxDistanceOfPeak);

        int maxNumberOfFlags = 1;
        for (int numberOfFlags = 1; numberOfFlags < maxDistanceOfPeak; numberOfFlags++) {
            for (int j = 0; j < listOfPeaks.size() - 1 && numberOfFlags < maxDistanceOfPeak; j++) {
                int currentPeak = listOfPeaks.get(j);
                int nextPeak = listOfPeaks.get(j+1);
                if (nextPeak - currentPeak < numberOfFlags) {
                    maxNumberOfFlags++;
                }
            }
        }

        return maxNumberOfFlags;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
    }
}
