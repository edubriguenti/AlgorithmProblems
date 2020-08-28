package com.edubriguenti.problems.hackerrank.math;

import java.util.Arrays;

public class FindThePoint {
    /*
     * Complete the findPoint function below.
     */
    static int[] findPoint(int px, int py, int qx, int qy) {
        int[] point = new int[2];
        int rx;
        int ry;
        if(px == qx) {
            rx = px;
            ry = (qy - py) + qy;
        } else if(py == qy) {
            ry = py;
            rx = (qx - px) + qx;
        } else {
            rx = (qx - px) + qx;
            ry = (qy - py) + qy;
        }
        point[0] = rx;
        point[1] = ry;
        return point;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findPoint(0, 0, 1, 1)));
        System.out.println(Arrays.toString(findPoint(1, 1, 2, 2)));
        System.out.println(Arrays.toString(findPoint(0, 0, 0, 1)));
        System.out.println(Arrays.toString(findPoint(0, 0, 0, -1)));

    }

}
