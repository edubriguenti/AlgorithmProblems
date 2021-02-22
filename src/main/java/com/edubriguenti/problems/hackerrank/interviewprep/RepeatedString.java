package com.edubriguenti.problems.hackerrank.interviewprep;

public class RepeatedString {


    static long repeatedString(String s, long n) {
        long numberOfAs = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberOfAs++;
            }
        }
        long numberOfStrings =  n / s.length();
        long remainder = n % s.length();
        if (remainder == 0) {
            return numberOfAs * numberOfStrings;
        } else {
            long partial = 0;
            if (numberOfStrings != 0) {
                partial = numberOfAs * numberOfStrings;
            }
            for (int i = 0; i < remainder; i++) {
                if (s.charAt(i) == 'a') {
                    partial++;
                }
            }
            return partial;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 1)); // 1

        System.out.println(repeatedString("aba", 10)); // 7
        System.out.println(repeatedString("abcac", 10)); // 4
    }
}
