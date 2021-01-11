package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/18 14:21
 */
public class 找不同389 {
    public static char findTheDifference(String s, String t) {
        //26字母字符计数
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            c[c1 - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            char c2 = t.charAt(j);
            c[c2 - 'a']--;
            //判断字符计数值为负数，则就是多余的那个
            if (c[c2 - 'a'] < 0) {
                return t.charAt(j);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));


    }

}
