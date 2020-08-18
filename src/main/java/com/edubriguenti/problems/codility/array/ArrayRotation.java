package com.edubriguenti.problems.codility.array;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int size = A.length;
        int[] returnArray = new int[size];
        for(int i = 0; i < size; i++) {
        	int pos = (i + K) % size;
        	returnArray[pos] = A[i];
        }
        return returnArray;
    }
    
    public static void main(String[] args) {
		solution(new int[]{1,2,3}, 2);
		solution(new int[]{3, 8, 9, 7, 6}, 3);
		solution(new int[]{1, 2, 3, 4}, 4);
		
	}
}