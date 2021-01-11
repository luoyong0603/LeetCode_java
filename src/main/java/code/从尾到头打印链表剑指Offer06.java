package code;

import java.util.Stack;

/**
 * @auther luoyong
 * @date 2020/12/19 16:09
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class 从尾到头打印链表剑指Offer06 {

    public int[] reversePrint(ListNode head) {
        //创建一个栈，用于存储链表的节点
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] l = new int[stack.size()];
        for (int i = 0; i < l.length; i++) {
            //栈的特点是后进先出，即最后压入栈的元素最先弹出。
            l[i] = stack.pop().val;
        }
        return l;
    }


}
