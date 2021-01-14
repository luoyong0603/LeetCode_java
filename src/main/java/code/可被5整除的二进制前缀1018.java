package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuoYong
 * @date 2021/1/14 20:47
 */
public class 可被5整除的二进制前缀1018 {

    /*
     * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：
     * 从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
     * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
     *
     *
     * */
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<Boolean>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            //每次只看个位数能否被5整除，唯有0能被5整除！
            sum = (sum * 2 + A[i]) % 5;
            list.add(sum == 0);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] l = new int[]{0, 1, 1};
        System.out.println(prefixesDivBy5(l));
    }

}
