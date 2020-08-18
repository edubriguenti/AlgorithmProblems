package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class PermCheck {
    public static int solution(int[] A) {
    	Arrays.sort(A);
        for (int i=0; i < A.length;i++) {
        	if(A[i] != (i+1)) {
        		return 0;
        	}
		}
        return 1;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(new int[] {4,1,3,2}));
		System.out.println(solution(new int[] {4,1,3}));
		System.out.println(solution(new int[] {1,2,3,1000000000}));
	}
}