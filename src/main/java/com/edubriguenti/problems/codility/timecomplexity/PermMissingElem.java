package com.edubriguenti.problems.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {
	
	
	
    public static int solution(int[] A) {
    	if (A.length == 0)
    		return 1;
    	
    	Arrays.sort(A);
    	
    	if (A[0] != 1)
    		return 1;
    	
    	int last = A[0];
    	for (int i = 1; i<A.length; i++) {
    		int actualNumber = A[i];
    		int probNumber = last + 1;
			if (actualNumber != probNumber)
				return probNumber;
			
			last = actualNumber;
		}
    	return last+1;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5}));
		
		System.out.println(solution(new int[] {100000,99999, 99998, 99996, 99997, 99994}));
	}

}
