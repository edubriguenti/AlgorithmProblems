package com.edubriguenti.problems.codility.prefixsums;

class MinAvgTwoSlice {
	public static int solution(int[] A) {
		int length = A.length;
		int[] prefixSum = new int[length];
		prefixSum[0] = A[0];
		for(int i = 1; i<length;i++) {
			prefixSum[i] = prefixSum[i-1] + A[i];
		}
		
		//System.out.println(Arrays.toString(prefixSum));
		
		int smallerPos = 9999999;
		double smallerValue = 9999999;
		for(int i = 0; i < length; i++) {
			for(int j=i+1; j < length && j > i;j++) {
				double sliceSum = (slice(prefixSum, i, j)) / (double)(j-i+1);
				//int number = A[i];
				//int number2 = A[j];
				if (sliceSum < smallerValue ) {
					smallerValue =  sliceSum;
					smallerPos = i;
				}
				//System.out.println("sliceSum i "+ i + "("+number+") j "+ j + "("+number2+")	 "+ sliceSum);
			}
		}
		
		return smallerPos;
	}
	
	static int slice(int[] a, int pos1, int pos2) {
		if (pos1 == 0) {
			return a[pos2];
		}
		return a[pos2] - a[pos1-1];
	}
	
	public static void main(String[] args) {
		//System.out.println(solution(new int[] {4,2,2,5,1,5,8}));
		
		System.out.println(solution(new int[] {10, 4, 1, 16, 20, 1, 1}));
	}
}