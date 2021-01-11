package code;

import java.util.Arrays;

/**
 * @auther luoyong
 * @date 2020/11/26 10:42
 */


/*
给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
如果数组元素个数小于 2，则返回 0。
 */
public class 最大间距_164 {

    public static int maximumGap(int[] nums) {
        int resultInt = 0;
        if (nums.length < 2) {
            return resultInt;
        }
        Arrays.sort(nums);
        //寻找相邻之间最大值
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] - nums[i - 1] > resultInt) {
                resultInt = nums[i] - nums[i - 1];
            }
        }
        return resultInt;
    }

    public static void main(String[] args) {
        int[] l = {1, 10000000};
        System.out.println(maximumGap(l));
    }


}
