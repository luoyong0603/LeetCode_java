package code;

import java.awt.*;
import java.math.BigInteger;

/**
 * @auther luoyong
 * @date 2020/12/13 10:46
 */


/**
 * 如果一个十进制数字不含任何前导零，且每一位上的数字不是 0 就是 1 ，那么该数字就是一个 十-二进制数 。例如，101 和 1100 都是 十-二进制数，而 112 和 3001 不是。
 * <p>
 * 给你一个表示十进制整数的字符串 n ，返回和为 n 的 十-二进制数 的最少数目。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = "32"
 * 输出：3
 * 解释：10 + 11 + 11 = 32
 * 示例 2：
 * <p>
 * 输入：n = "82734"
 * 输出：8
 * 示例 3：
 * <p>
 * 输入：n = "27346209830709182346"
 * 输出：9
 */

public class 十二进制数的最少数目5626 {

    private static int ans = 0;

    public static int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("27346209830709182346"));
    }

}
