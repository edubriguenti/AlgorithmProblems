package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

class MissingInteger {
    public static int solution(int[] A) {
    	Arrays.sort(A);
    	int lastValue = 999999999;
    	int shouldBeNumber = 1;
    	for(int i : A) {
    		if (i > 0 && i != lastValue) {
    			lastValue = i;
    			if (shouldBeNumber != i) {
    				return shouldBeNumber;
    			}
    			shouldBeNumber++;
    		}
    	}
    	
    	return shouldBeNumber;
    	
    }
    
    public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,6,4,1,2}));
		System.out.println(solution(new int[] {1,2,3}));
		System.out.println(solution(new int[] {-1,-3}));
	}
}