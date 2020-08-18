package com.edubriguenti.problems.codility.stacksandqueues;

import java.util.Stack;

public class StoneWallCopied {
    public static void main(String[] args) {
//        System.out.println("Stone needed are : " + solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
//        System.out.println("Stone needed are : " + solution(new int[]{1, 2, 1}));
//        System.out.println("Stone needed are : " + solution(new int[]{1, 2, 0, 1, 5, 6}));
//        System.out.println("Stone needed are : " + solution(new int[]{}));
//        System.out.println("Stone needed are : " + solution(new int[]{1,3,1000}));
        System.out.println("Stone needed are : " + solution(new int[]{1,2}));
    }

    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<Integer>();
        int counter = 0;
        int i = 0;

        while (i < H.length) {
            //If the element is 0 reset, no history needed as next one will be a new Block.
            if (H[i] == 0) {
                stack.clear();
                i++;
                continue;
            }
            //The stack is not empty a base can be found
            if (!stack.isEmpty()) {
                //Is equal no block is needed same height
                if (stack.peek() == H[i]) {
                    i++;
                    //The current element is small a new block needed to reach the height
                } else if (stack.peek() < H[i]) {
                    counter++;
                    stack.push(H[i]);
                    i++;
                    //The current element is taller need to pop and reenter the while
                } else {
                    stack.pop();
                }
                //Stack is empty add a block
            } else {
                counter++;
                stack.push(H[i]);
                i++;
            }
        }
        return counter;
    }

}
