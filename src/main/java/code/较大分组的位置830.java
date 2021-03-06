package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther luoyong
 * @date 2021/01/05 16:42
 */
public class 较大分组的位置830 {

//    在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
//
//例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
//
//分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
//
//我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
//
//找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
//
//示例 1：
//
//输入：s = "abbxxxxzzy"
//输出：[[3,6]]
//解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。


    public static List<List<Integer>> largeGroupPositions1(String s) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    if (j - i >= 3) {
                        List<Integer> l = new ArrayList<>();
                        l.add(i);
                        l.add(j - 1);
                        list.add(l);
                        //直接跳过该字符段
                        i = j - 1;
                    }
                    break;
                }
                //用于处理一种字符段的情况
                if (s.charAt(j) == s.charAt(i) && j == s.length() - 1 && j - i >= 2) {
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    list.add(l);
                    //直接跳过该字符段
                    i = j;
                    break;
                }
            }
        }
        return list;
    }

    public static List<List<Integer>> largeGroupPositions2(String s) {
        List<List<Integer>> list = new ArrayList<>();
        //用于计数
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (count >= 3) {
                    List l = new ArrayList<>();
                    //用count求起始位置
                    l.add(i - count + 1);
                    l.add(i);
                    list.add(l);
                }
                //添加完清空
                count = 1;
            } else {
                count++;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(largeGroupPositions1("babaaaabbb"));
    }


}
