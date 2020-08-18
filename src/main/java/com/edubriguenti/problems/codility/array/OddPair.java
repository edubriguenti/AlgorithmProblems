package com.edubriguenti.problems.codility.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddPair {
    public static int solution(int[] A) {
        HashMap<Integer, Integer> numberOfOcorrences = new HashMap<>();
        for(int i : A) {
            if (numberOfOcorrences.containsKey(i)) {
                numberOfOcorrences.put(i, numberOfOcorrences.get(i) + 1);
            } else {
                numberOfOcorrences.put(i,1);
            }
        }
        final Set<Map.Entry<Integer, Integer>> entries = numberOfOcorrences.entrySet();
        for (Map.Entry<Integer, Integer> entry: entries) {
            if (entry.getValue() % 2 != 0)
                return entry.getKey();
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
    }
}
