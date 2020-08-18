package com.edubriguenti.problems.codility.stacksandqueues;

public class Nesting {


    public static int solution(String S) {
        //Get the first element
        //if it is open, add to a stack
        //if it is closed, pop the element of the stack
            //if the stack is empty return 0;
            //return 1
        if (S.isEmpty())
            return 1;

        int numberOfOpens = 0;
        for (int i = 0; i < S.length(); i++) {
            char element = S.charAt(i);
            if (element == '(') {
                numberOfOpens++;
            } else {
                if (numberOfOpens == 0) {
                    return 0;
                } else {
                    numberOfOpens--;
                }
            }
        }
        if (numberOfOpens == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("("));
        System.out.println(solution(")"));
        System.out.println(solution("((((())))"));
        System.out.println(solution("((((()))))"));
        System.out.println(solution("()"));
        System.out.println(solution("()()"));
    }
}
