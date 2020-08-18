package com.edubriguenti.problems.codility.stacksandqueues;

import java.util.Stack;

public class Brackets {


    public static int solution(String S) {
        if (S.isEmpty())
            return 1;

        final char[] chars = S.toCharArray();
        Stack<Character> openBrackets = new Stack<>();

        for(char c: chars) {
            if (c == '(' || c == '{' || c == '['){
                openBrackets.push(c);
            } else {
                if (openBrackets.isEmpty()) {
                    return 0;
                } else {
                    final Character openBrancket = openBrackets.pop();
                    if (!openBrancket.equals(getOpenBracketOf(c))){
                        return 0;
                    }
                }
            }
        }
        if (openBrackets.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static char getOpenBracketOf(char c) {
        if (c == '}') {
            return '{';
        } else if (c == ')') {
            return '(';
        } else {
            return '[';
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(""));  // 1
        System.out.println(solution("([)()]"));  // 0
        System.out.println(solution("{[()()]}")); // 1
        System.out.println(solution("{{[()()()]}}")); // 0
    }
}
