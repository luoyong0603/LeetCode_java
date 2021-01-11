package code;

import java.util.*;

/**
 * @auther luoyong
 * @date 2020/12/14 11:12
 */
public class 字母异位词分组49 {

    /*
     *
     *
     *
     * */

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>(16);
        for (String s : strs) {
            char[] ch = s.toCharArray();//转字符数组，目的是按字母表升序
            Arrays.sort(ch);//排序
            String key = String.valueOf(ch);//字符数组转字符串
            if (!map.containsKey(key)) { //判断是否存在key，不存在新new一个list
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);//存在即add
        }
        Collection values = map.values();
        List list = new ArrayList();
        for (Object o : values) {
            list.add(o);
        }
        return list;
    }


    public static void main(String[] args) {
        String[] l = new String[]{"eat", "tae", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(l));
    }
}
