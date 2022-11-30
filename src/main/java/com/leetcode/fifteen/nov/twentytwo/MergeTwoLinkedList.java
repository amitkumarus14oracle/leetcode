package com.leetcode.fifteen.nov.twentytwo;

import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class MergeTwoLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        if(list1.val < list2.val) {
            result.val = list1.val;
            list1 = list1.next;
        } else {
            result.val = list2.val;
            list2 = list2.next;
        }
        ListNode head = result;
        while(list1 != null && list2 != null) {
            ListNode temp = new ListNode();
            if(list1.val < list2.val) {
                temp.val = list1.val;
                list1 = list1.next;
            } else {
                temp.val = list2.val;
                list2 = list2.next;
            }
            result.next = temp;
            result = temp;
        }
        if(list1 == null) {
            result.next = list2;
        } else if(list2 == null) {
            result.next = list1;
        }
        return head;
    }
}
