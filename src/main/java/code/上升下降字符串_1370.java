package code;

/**
 * @auther luoyong
 * @date 2020/11/26 10:06
 */


/*
* 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
重复步骤 2 ，直到你没法从 s 中选择字符。
从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
重复步骤 5 ，直到你没法从 s 中选择字符。
重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。
请你返回将 s 中字符重新排序后的 结果字符串 。
* */
public class 上升下降字符串_1370 {

    //采用桶排序
    public static String sortString(String s) {
        //存放26字母的桶
        int[] count = new int[26];
        char[] c = s.toCharArray();
        //存储计算的结果
        StringBuilder str = new StringBuilder();
        //把s中的字符分别放到对应的桶里，统计字母个数
        for (char c1 : c) {
            count[c1 - 'a']++;
        }
        while (str.length() != s.length()) {
            //先从左往右找，遍历26个桶,如果当前桶不为空，
            //就从当前桶里拿出一个元素出来
            for (int i = 0; i < count.length; i++) { //步骤123
                if (count[i] > 0) {
                    str.append((char) (i + 'a'));//转成对应的字母
                    count[i]--; //拿出之后桶中元素的个数要减1
                }
            }
            //从右往左拿，同上
            for (int j = count.length - 1; j >= 0; j--) {//步骤456
                if (count[j] > 0) {
                    str.append((char) (j + 'a'));//转成对应的字母
                    count[j]--;
                }
            }
        }
        //把结果转化为字符串
        return str.toString();
    }


    public static void main(String[] args) {
        String str = "aleetcode";
        System.out.println(sortString(str));
    }


}
