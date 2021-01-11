package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luoyong
 * @date 2020/12/04 15:40
 */
public class 回文链表_234 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> l = new ArrayList();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
//        for (int i =0;i<l.size()/2;i++) {
//            if (!l.get(l.size()-1-i).equals(l.get(i))) {
//                return false;
//            }
//        }
        int left = 0;
        int right = l.size() - 1;
        while (left < right) {
            if (!l.get(left).equals(l.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
