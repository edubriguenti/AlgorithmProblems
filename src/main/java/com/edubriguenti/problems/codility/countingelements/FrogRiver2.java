package com.edubriguenti.problems.codility.countingelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrogRiver2 {

    public static int solution(int X, int[] A) {
       //Get all the seconds for a position
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            final List<Integer> listOfSeconds = map.getOrDefault(A[i], new ArrayList<>());
            listOfSeconds.add(i);
            map.put(A[i], listOfSeconds);
        }

        //Check the second for every position
        final Set<Integer> positions = map.keySet();
        int earliestTime = -1;
        for (int i = 1; i <= X; i++) {
            if (positions.contains(i)) {
                final List<Integer> times = map.get(i);
                int earliestForCurrentPos = Integer.MAX_VALUE;
                for (Integer time: times) {
                    if (time < earliestForCurrentPos)
                        earliestForCurrentPos = time;
                    if (earliestForCurrentPos > earliestTime)
                        earliestTime = earliestForCurrentPos;
                }
            } else {
                return -1;
            }
        }
        return earliestTime;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {1,3,1,4,2,3,5,4}));
    }
}
