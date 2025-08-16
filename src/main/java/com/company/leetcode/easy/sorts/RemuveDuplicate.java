package com.company.leetcode.easy.sorts;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class RemuveDuplicate {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }


}
