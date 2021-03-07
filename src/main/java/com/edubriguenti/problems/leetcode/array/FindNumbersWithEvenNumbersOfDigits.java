package com.edubriguenti.problems.leetcode.array;

import java.util.Arrays;

class FindNumbersWithEvenNumbersOfDigits {
    public static int findNumbers(int[] nums) {
        int i = 0;
        int evenNumbers = 0;
        while (i < nums.length) {
            int num = nums[i];
            if ((String.valueOf(num).length() % 2) == 0) {
                evenNumbers++;
            }
            i++;
        }
        return evenNumbers;
    }

    public static int findNumbers2(int[] nums) {
        return Arrays.stream(nums).reduce(0, (subTotal, element) ->  {
            if (String.valueOf(element).length() % 2 == 0) {
                return subTotal + 1;
            } else {
                return subTotal;
            }
        });
    }

    public static int findNumbers3(int[] nums) {
        return Arrays.stream(nums).reduce(0, (subTotal, element) ->  {
            if ((element > 9 && element < 100) || (element > 999 && element < 10000)) {
                return subTotal + 1;
            } else {
                return subTotal;
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{1, 22, 111, 2222}));
        System.out.println(findNumbers3(new int[]{1, 22, 111, 2222}));
    }
}
