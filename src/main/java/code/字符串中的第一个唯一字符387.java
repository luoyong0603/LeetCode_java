package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/23 11:29
 */
public class 字符串中的第一个唯一字符387 {

    //数组统计
    public static int firstUniqChar(String s) {
        //统计次数
        int[] l = new int[26];
        for (int i = 0; i < s.length(); i++) {
            l[s.charAt(i) - 'a']++;
        }
        //找到次数为1直接返回
        for (int j = 0; j < s.length(); j++) {
            if (l[s.charAt(j) - 'a'] == 1) {
                return j;
            }
        }
        return -1;
    }

    //map统计
    public static int firstUniqChar1(String s) {
        //统计次数
        Map<Character, Integer> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
//            boolean ok = map.containsKey(s.charAt(i)); //判断map存在key
//            if (!ok) {
//                map.put(s.charAt(i), 1);
//                continue;
//            }
//            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        //找到次数为1直接返回
        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

}
