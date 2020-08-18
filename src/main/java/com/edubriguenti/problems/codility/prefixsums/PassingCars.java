package com.edubriguenti.problems.codility.prefixsums;
class PassingCars {
    public static int solution(int[] A) {
    	
    	int numberOfPairs = 0;
    	int numberOfZeros = 0;
    	for (int i : A) {
    		if (i == 0) {
    			numberOfZeros++;
    		}else {
    			numberOfPairs = numberOfPairs + numberOfZeros;
    		}
    		if (numberOfPairs > 1000000000)
    			return -1;
		}
    	
        return numberOfPairs;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(new int[] {0,1,0,1,1,0,0,0,1}));
	}
}