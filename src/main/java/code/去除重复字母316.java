package code;

import java.util.LinkedList;

/**
 * @auther luoyong
 * @date 2020/12/20 13:29
 */
public class 去除重复字母316 {

    public static String removeDuplicateLetters(String s) {
        LinkedList<Character> deque = new LinkedList<>();
        int[] count = new int[26];
        boolean[]exists = new boolean[26];
        // 初始化
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        // 遍历s并入栈
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            //判断该位置字母没有在栈中出现过
            if (!exists[temp - 'a']){
                //栈不为空 && 栈顶元素字典序列靠后 && 栈顶元素还有剩余出现次数
                while (!deque.isEmpty() && deque.getLast() > temp && count[deque.getLast() - 'a'] > 0){
                    // 修改出现状态
                    exists[deque.getLast() - 'a'] = false;
                    // 栈顶元素弹出。替换
                    deque.removeLast();
                }
                // 该位置的字母压栈
                deque.add(temp);
                // 修改出现状态
                exists[temp - 'a'] = true;
            }
            // 遍历过的字母出现次数减一
            count[temp - 'a']--;
        }
        //返回栈中元素
        StringBuilder res = new StringBuilder();
        for(char ch : deque){
            res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

}
