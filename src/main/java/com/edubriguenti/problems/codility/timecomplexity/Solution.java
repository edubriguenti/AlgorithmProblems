package com.edubriguenti.problems.codility.timecomplexity;
class Solution {
    public static int solution(int[] A) {
    	int firstPart = A[0];
    	int secondPart = 0;
        for(int i=1; i<A.length; i++) {
        	secondPart += A[i]; 
        }
        
        int minorDifference = Math.abs(firstPart - secondPart);
        for(int i=1; i<A.length-1; i++) {
        	firstPart+= A[i];
        	secondPart-= A[i];
        	int diffence = Math.abs(firstPart - secondPart);
        	if (diffence < minorDifference) {
        		minorDifference = diffence;
        	}
        }
        
        return minorDifference;
        
    }
    
    
    public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 1, 2, 4, 3}));
		System.out.println(solution(new int[] {0, 2000}));
	}
}