package com.leetcode.fifteen.nov.twentytwo;

import java.util.PriorityQueue;

public class MergeKLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((o1, o2) -> o1.val-o2.val);
        for(ListNode node: lists) {
            if(node != null)
                queue.add(node);
        }
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(!queue.isEmpty()) {
            curr.next = queue.poll();
            curr = curr.next;
            if(curr.next != null) {
                queue.add(curr.next);
            }
        }
        return temp.next;
    }
}
