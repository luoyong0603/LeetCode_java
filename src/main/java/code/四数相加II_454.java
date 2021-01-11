package code;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/11/27 09:36
 */
public class 四数相加II_454 {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        //计算出所有a+b之和的情况，value存出现次数
        HashMap<Integer, Integer> map_ab = new HashMap<Integer, Integer>(16);
        for (int a : A) {
            for (int b : B) {
                int value_ab = a + b;
                //判断key是否存在
                boolean ok = map_ab.containsKey(value_ab);
                if (!ok) {
                    map_ab.put(value_ab, 1);
                } else {
                    //存在key，次数加一
                    map_ab.put(value_ab, map_ab.get(value_ab) + 1);
                }
            }
        }
        //遍历cd取c+d
        for (int c : C) {
            for (int d : D) {
                int value_cd = c + d;
                //先判断是否存在key；要求相加为零，特地key取反；若存在，则满足a+b+c+d = 0;
                boolean ok = map_ab.containsKey(-value_cd);
                //不存在，直接跳出此次循环
                if (!ok) {
                    continue;
                }
                //key对应的value
                int mu = map_ab.get(-value_cd);
                count += mu;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};
        System.out.println(fourSumCount(A, B, C, D));
    }

}
