package com.leetcode.seventh.nov.twentytwo;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthNodeFromEndOfTheList {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        int nFromStart = size - n;
        curr = head;
        int currentPos = 0;
        if(nFromStart == 0) {
            return head.next;
        }
        while(currentPos <= nFromStart - 1) {
            if(currentPos == nFromStart - 1) {
                ListNode next = curr.next;
                ListNode temp = next.next;
                curr.next = temp;
            }
            curr = curr.next;
            currentPos++;
        }
        return head;
    }
}
