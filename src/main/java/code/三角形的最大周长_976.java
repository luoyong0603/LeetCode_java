package code;

import java.util.Arrays;

/**
 * @auther luoyong
 * @date 2020/11/29 12:07
 */


/*
* 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
如果不能形成任何面积不为零的三角形，返回 0
* */
public class 三角形的最大周长_976 {


    public static int largestPerimeter(int[] A) {
        int sum = 0;
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                sum = A[i] + A[i - 1] + A[i - 2];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] l = new int[]{2, 1, 2};
        System.out.println(largestPerimeter(l));
    }


}
