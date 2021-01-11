package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/16 14:53
 */

/*
* 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。

这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。

示例1:

输入: pattern = "abba", str = "dog cat cat dog"
输出: true
示例 2:

输入:pattern = "abba", str = "dog cat cat fish"
输出: false

* */
public class 单词规律290 {

    public static boolean wordPattern(String pattern, String s) {
        //先将s分割
        String[] str = s.split(" ");
        //长度不等直接返回false
        if (str.length != pattern.length()) {
            return false;
        }
        //定义map存，因为两个字符串的下标是一一对应的；利用put返回的value判断即可
        Map map = new HashMap(16);
        for (Integer i = 0; i < pattern.length(); i++) {
            if (!map.put(pattern.charAt(i), i).equals(map.put(str[i], i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog bat cat dog"));

    }


}
