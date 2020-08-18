package com.edubriguenti.problems.codility.leader;

public class EquiLeader {

    public static int solution(int[] A) {
        //iterate the array
        // get the element
        // see if it is an equileader backwards
        // if has
        //  count the number of necessary leaders forward
        //.    check
        //.    if it is an equileader sum++;
        if (A.length == 1)
            return 0;

        int numberOfEquileaders = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int candidate = A[i];
            final boolean hasLeftEquileader = hasEquileader(candidate, 0, i+1, A);
            System.out.println("HasLeftEquileader " + hasLeftEquileader);
            final boolean hasRightEquileader = hasEquileader(candidate, i+1, A.length, A);
            System.out.println("HasRightEquileader " + hasRightEquileader);

            if (hasLeftEquileader && hasRightEquileader) {
                numberOfEquileaders++;
                System.out.println("POS IS EQUILEADER " + i);

            }
        }


        return numberOfEquileaders;
    }

    private static boolean hasEquileader(int candidate, int from, int to, int[] array) {
        int numberNecessaryToBeDominant = (to - from) / 2;
        int count = 0;
        if (from == to)
            return true;
        for (int i = from; i < to; i++) {
            int currentElem = array[i];
            if (candidate == currentElem) {
                count++;
                if (count > numberNecessaryToBeDominant)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1})); // 0
//        System.out.println(solution(new int[]{1, 1})); // 1
//        System.out.println(solution(new int[]{1, 1, 1})); // 2
//        System.out.println(solution(new int[]{1, 2})); // 0
//        System.out.println(solution(new int[]{1, 2, 1})); // 0
//        System.out.println(solution(new int[]{4, 3, 4, 4, 4, 2})); //2
        System.out.println(solution(new int[]{4, 4, 2, 5, 3, 4, 4, 4})); // 3

    }
}
