package com.edubriguenti.problems.codility.maximumsliceproblem;


public class ExampleO3 {

    /**
     * O (n2)
     */
    public static int findMaximalSliceO2(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < array.length; j++) {
               sum += array[j];
               if (sum > maxSum)
                   maxSum = sum;
            }
        }
        return maxSum;
    }


    public static int prefixSum(int[] array) {
        int sum = 0;
        int[] prefixSumArray = new int[array.length];
        for (int i = 0; i< array.length; i++) {
            sum += array[i];
            prefixSumArray[i] = sum;
        }
        int max = Integer.MIN_VALUE;
        int begin = -1;
        int end = -1;
        for (int i = 0; i < prefixSumArray.length ; i++) {
            for(int j = i+1; j < prefixSumArray.length; j++) {
                int pSum = prefixSumArray[j] - prefixSumArray[i];
                if (pSum > prefixSumArray[j]) {
                    if (pSum > max) {
                        max = pSum;
                        begin = i + 1;
                        end = j;
                    }
                } else {
                    if (prefixSumArray[j] > max) {
                        max = prefixSumArray[j];
                        begin = 0;
                        end = j;
                    }
                }
            }
        }
        System.out.println("POS inicial slice "+ begin);
        System.out.println("POS final slice "+ end);
        return max;
    }

    public static int kadaneAlgo(int[] array){
        int maxSoFar = 0;
        int maxEnding = 0;
        int begin = -1;
        int end = -1;
        for (int i = 0; i < array.length; i++) {
            maxEnding += array[i];
            if (begin == -1)
                begin = i;
            if (maxSoFar < maxEnding) {
                maxSoFar = maxEnding;
                System.out.println(i);
                end = i;
            }
            if (maxEnding < 0) {
                maxEnding = 0;
                begin = -1;
            }
        }
        if (end < begin)
            begin = end;
        System.out.println("Begin "+ begin);
        System.out.println("End "+ end);

        return maxSoFar;
    }



    public static int findMaximalSliceOn(int[] array) {
        int maxEnding = 0, maxSlice = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            maxEnding = Math.max(0, maxEnding + elem);
            maxSlice = Math.max(maxSlice, maxEnding);

        }
        return maxSlice;
    }



    public static void main(String[] args) {
//        System.out.println(findMaximalSliceO2(new int[] { 5, -7, 3, 5, -2, 4, -1}));
//        System.out.println(prefixSum(new int[] { 5, -7, 3, 5, -2, 4, -1}));
        //System.out.println(kadaneAlgo(new int[] { 5, -7, 3, 5, -2, 4, -1}));
        System.out.println(kadaneAlgo(new int[] { 5, -7, -3, -1, -2, -1, 20}));
    }
}
