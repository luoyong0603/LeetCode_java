package code;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther luoyong
 * @date 2020/12/13 21:06
 */
public class 存在重复元素217 {


    //map统计法
    public boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            boolean ok = map.containsKey(nums[i]);
            if (ok) {
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }

    //排序
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    //直接list去重  java8拥有
    public boolean containsDuplicate3(int[] nums) {
//        return Arrays.streams(nums).distinct().count() != nums.length;
        return true;
    }


}
