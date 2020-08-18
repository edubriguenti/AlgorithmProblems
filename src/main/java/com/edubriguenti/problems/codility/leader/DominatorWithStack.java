package com.edubriguenti.problems.codility.leader;


import java.util.Stack;

public class DominatorWithStack {

    public static int solution(int[] A) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int elem = A[i];
            if (stack.isEmpty()) {
                stack.push(elem);
            } else {
                if (stack.peek().equals(elem)) {
                    stack.push(elem);
                } else {
                    stack.pop();
                }
            }

        }

        if (!stack.isEmpty()) {
            int numberOfOccurences = 0;
            int necessaryNumber = (A.length / 2) + 1;
            int candidate = stack.pop();
            int candidatePos = -1;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == candidate) {
                    numberOfOccurences++;
                    if (candidatePos == -1)
                        candidatePos = i;
                }
                if (numberOfOccurences == necessaryNumber)
                    return candidatePos;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,1}));

//
        System.out.println(solution(new int[]{1,2,1}));
        System.out.println(solution(new int[]{0}));
        System.out.println(solution(new int[]{0,1,1,0,1,1,1,1}));
        System.out.println(solution(new int[]{1,2,3}));
    }
}
