package com.edubriguenti.problems.codility.prefixsums;

import java.util.Arrays;

class GenomicRangeQuery2 {
	public static int[] solution(String S, int[] P, int[] Q) {
		
		int[] returnInts = new int[P.length];		
		for(int i=0; i < P.length; i++) {
			int p = P[i];
			int q = Q[i];
			int lesser = 5;
			for(;p<=q;p++) {
				char charAt = S.charAt(p);
				int actual = 0;
				if(charAt == 'A'){
					actual = 1;
				}else if(charAt == 'C') {
					actual = 2;
				}else if (charAt == 'G') {
					actual = 3;
				}else if (charAt == 'T') {
					actual = 4;
				}
				if (actual < lesser)
					lesser = actual;
			}
			returnInts[i] = lesser;
		}
		return returnInts;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("CAGCCTA",  new int[] {2,5,0}, new int[] {4,5,6})));
	}
}