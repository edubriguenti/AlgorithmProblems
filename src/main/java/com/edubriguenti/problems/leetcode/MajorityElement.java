package com.edubriguenti.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
        System.out.println(majorityElement(new int[] {1,1,1,2,2,2,2}));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums.length/2 + 1;
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int currentNumber : nums) {
            if (map.containsKey(currentNumber)) {
                int numberOfOccurrences = map.get(currentNumber) + 1;
                if (numberOfOccurrences >= majority)
                    return currentNumber;
                map.put(currentNumber, numberOfOccurrences);
            } else {
                map.put(currentNumber, 1);
            }
        }

        return -1;
    }
}
