package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/27 22:06
 */
public class 同构字符串205 {


    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
//            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
//            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
            if (!map1.put(s.charAt(i), i).equals(map1.put(t.charAt(i), i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic1(String s, String t) {

        int[] l1 = new int[128];
        int[] l2 = new int[128];
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (l1[c1[i]] != l2[c2[i]]) {
                return false;
            }
            l1[c1[i]] = i + 1;
            l2[c2[i]] = i + 1;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic1("aba", "baa"));
    }


}
