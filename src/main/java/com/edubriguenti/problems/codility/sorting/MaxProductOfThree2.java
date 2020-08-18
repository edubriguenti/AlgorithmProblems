package com.edubriguenti.problems.codility.sorting;

import java.util.Arrays;

class MaxProductOfThree2 {
	public static int solution(int[] A) {
		Arrays.sort(A);
		int third = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
		int four = A[0] * A[1] * A[2];

		return Math.max(third, four);
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {-3, 1,2,-2, 5, 6}));
		System.out.println(solution(new int[] {-3, -2,-1,0}));
		System.out.println(solution(new int[] {-3, -2,-1}));
	}


}