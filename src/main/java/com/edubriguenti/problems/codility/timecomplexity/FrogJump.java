package com.edubriguenti.problems.codility.timecomplexity;

class FrogJump {
	public static int solution(int X, int Y, int D) {
		if (X == Y)
			return 0;
		
		
		return (int)Math.ceil((Y - X) / (double)D);
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution(1, 5, 2));
	}
}