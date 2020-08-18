package com.edubriguenti.problems.codility.countingelements;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class FrogRiver {
    public static int solution(int X, int[] A) {
    	boolean[] path = new boolean[X+1];
        for(int i=0;i<A.length;i++) {
        	int leaf = A[i];
        	if (!path[leaf]) {
        		path[leaf] = true;
        		X--;
        	}
        	if (X <=0)
        		return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
		System.out.println(solution(6, new int[]{1,3,1,4,2,3,5,4,6}));
	}
}