package com.edubriguenti.problems.codility.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
	public static int solution(int[] A) {
		Map<Integer, Integer> valueMap = new HashMap<>();
		for (int i : A) {
			Integer numberOfValue = valueMap.get(i);
			if (numberOfValue == null) {
				valueMap.put(i, 1);
			} else {
				valueMap.put(i, numberOfValue + 1);
			}
		}
		Set<Integer> keySet = valueMap.keySet();
		for (Integer key : keySet) {
			Integer value = valueMap.get(key);
			if (value % 2 == 1)
				return key;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
	}
}