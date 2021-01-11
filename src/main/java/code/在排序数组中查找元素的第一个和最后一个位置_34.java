package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luoyong
 * @date 2020/12/01 09:34
 */
public class 在排序数组中查找元素的第一个和最后一个位置_34 {

    public static int[] searchRange(int[] nums, int target) {
        //先二分查找，找到其中一个目标值对应的下标
        int find = search(nums, target);
        if (find == -1) {
            return new int[]{-1, -1};
        }
        //左右临界
        int left = find;
        int right = find;
        //判断左边是否还存在同目标值
        while (left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }
        //判断右边是否还存在同目标值
        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }
        //从结果上
        return new int[]{left, right};
    }

    //二分查找一个
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] l = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(searchRange(l, 8));

    }

}
