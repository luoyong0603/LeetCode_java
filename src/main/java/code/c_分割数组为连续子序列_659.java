package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/04 14:52
 */


/*
给你一个按升序排序的整数数组 num（可能包含重复数字），请你将它们分割成一个或多个子序列，其中每个子序列都由连续整数组成且长度至少为 3 。
如果可以完成上述分割，则返回 true ；否则，返回 false 。
*/
public class c_分割数组为连续子序列_659 {

    public static boolean isPossible(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        //先统计数字出现次数
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (int i : nums) {
            boolean ok = map.containsKey(i);
            if (!ok) {
                map.put(i, 1);
                continue;
            }
            map.put(i, map.get(i) + 1);
        }


        return false;
    }

    public static void main(String[] args) {
        int[] l = new int[]{1, 2, 3, 3, 4, 5};
        System.out.println(isPossible(l));
    }





}


