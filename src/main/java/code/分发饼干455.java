package code;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther luoyong
 * @date 2020/12/25 10:25
 */
public class 分发饼干455 {
    public static int findContentChildren(int[] g, int[] s) {


        HashMap<Object, Object> map = new HashMap<>();


        int count = 0;
        //排序,尽量用最小的饼干给孩子
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; count < g.length && i < s.length; i++) {
            if (g[count] <= s[i]) { //满足+1
                count++;//分到饼干了轮到下一个孩子
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] l1 = new int[]{1, 2};
        int[] l2 = new int[]{1, 2, 3};
        System.out.println(findContentChildren(l1, l2));
    }


}
