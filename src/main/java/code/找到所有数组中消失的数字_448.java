package code;

import java.util.*;

/**
 * @auther luoyong
 * @date 2020/12/08 17:25
 */
public class 找到所有数组中消失的数字_448 {

    //map法
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (Integer num : nums) {
            map.put(num, 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }

    /*
    * 原地修改
    * */

    //遍历输入数组的每个元素一次。
    //我们将把 nums[i]-1 索引位置的元素标记为负数。即 nums[nums[i]- 1]*−1
    //然后遍历数组，若当前数组元素 nums[i] 为负数，说明我们在数组中存在数字 i+1
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            //防止下标越界
            if(newIndex >=nums.length){
                continue;
            }
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] l = new int[]{4, 4, 5, 6, 10};
//        System.out.println(findDisappearedNumbers1(l));
//        System.out.println(findDisappearedNumbers2(l));

        System.out.println(4>>>1);
    }


}
