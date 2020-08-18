package com.edubriguenti.problems.codility.sorting;

import java.util.Arrays;

class MaxProductOfThree {
	public static int solution(int[] A) {
		Arrays.sort(A);
		
		int upperMax = A[A.length-1] * A[A.length-2] * A[A.length-3];
		int bottomMax = A[0] * A[1] * A[A.length-1];
		
		return Math.max(upperMax, bottomMax);
		
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 4, 5, 1, 0 }));
		System.out.println(solution(new int[] { -3, 1, 2, -2, 5, 6 }));
		System.out.println(solution(new int[] { -5, 5, -5, 4 }));
	}
}