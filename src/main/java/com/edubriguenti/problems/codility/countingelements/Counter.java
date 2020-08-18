package com.edubriguenti.problems.codility.countingelements;

import java.util.Arrays;

class Counter {
	public static int[] solution(int N, int[] A) {
		
		int[] counterArray = new int[N];
		
		int maxCounter = 0;
		int sumUp = 0;
		for(int i : A) {
			if (i == N + 1) {
				counterArray = new int[N]; 
				sumUp += maxCounter;
				maxCounter = 0;
				continue;
			}
			
			if (++counterArray[i-1] > maxCounter)
				maxCounter = counterArray[i-1];
		
		}
		
		for(int i=0; i<counterArray.length;i++) {
			counterArray[i] += sumUp;
		}

		
		return counterArray;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {3,4,4,6,1,4,4})));
		System.out.println(Arrays.toString(solution(5, new int[] {3,4,4,6,1,6,1,1,5,5,5,6})));
		System.out.println(Arrays.toString(solution(2, new int[] {1,1,1,3,1,1})));
	}
}