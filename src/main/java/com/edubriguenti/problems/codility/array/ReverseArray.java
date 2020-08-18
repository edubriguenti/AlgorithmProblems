package com.edubriguenti.problems.codility.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseArray {

    static void reverse(int[] input) {
        int mid = input.length / 2;
        for (int i = 0, j = input.length - 1; i < mid; i++, j--) {
            //swap
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }

    static int[] reverseReturningArray(int[] input) {
        int[] result = new int[input.length];
        int mid = input.length / 2;
        for (int i = 0, j = input.length - 1; i <= mid; i++, j--) {
            result[i] = input[j];
            result[j] = input[i];
        }
        return result;
    }

    public static void main(String[] args) {
        final int[] input = {10, 20, 30};
        reverse(input);
        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(reverseReturningArray(input)));
        //How to do tha twith streams?
    }

    public static <T> Collector<T, ?, Stream<T>> reversed() {
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        });
    }

}
