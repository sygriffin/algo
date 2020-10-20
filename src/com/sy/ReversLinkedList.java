package com.sy;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReversLinkedList {
    public static int[] reversePrint(ListNode head) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        while (head != null) {
            list.addFirst(head.val);
            head = head.next;
        }

        if (list.size() > 10000) {
            return new int[0];
        }

        int [] arr = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
