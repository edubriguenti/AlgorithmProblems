package com.edubriguenti.problems.codility.stacksandqueues;

import java.util.Stack;

public class Fish {

    public static int solution(int[] A, int[] B) {
        //iterar sobre a lista
        //caso ache um peixe B == 1
        //coloca em uma pilha
        //caso ache um peixe 0 e tem peixe 1 na pilha
        //veja quem sobrevive
        //Se o peixe do rio sobreviver, soma um no contador
        //no final o total vai ser a quantidade da pilha + contador
        int totalRemaining = 0;
        Stack<Integer> downstreamFishStack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            boolean isDownstreamFish = B[i] == 1;
            if (isDownstreamFish) {
                downstreamFishStack.push(i);
            } else {
                if (downstreamFishStack.isEmpty()) {
                    totalRemaining++;
                } else {
                    while(!downstreamFishStack.isEmpty()) {
                        final Integer downStreamFishPos = downstreamFishStack.pop();
                        final Integer downStreamFish = A[downStreamFishPos];
                        final Integer upStreamFish = A[i];
                        if (downStreamFish > upStreamFish) {
                            downstreamFishStack.push(downStreamFishPos);
                            break;
                        }
                    }
                    if (downstreamFishStack.isEmpty()){
                        totalRemaining++;
                    }
                }
            }
        }
        return totalRemaining + downstreamFishStack.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1}, new int[]{0})); // 1
        System.out.println(solution(new int[]{1}, new int[]{1})); // 1
        System.out.println(solution(new int[]{1,2,3}, new int[]{1,0,0})); // 2
        System.out.println(solution(new int[]{3,1,2}, new int[]{1,0,0})); // 1
        System.out.println(solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0})); // 2
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{0,0,0,0,0,0,0,0,0,0})); // 10
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{1,1,1,1,1,1,1,1,1,1})); // 10
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{0,1,1,1,1,0,1,1,1,0})); // 10
    }
}
