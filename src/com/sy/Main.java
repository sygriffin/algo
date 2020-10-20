package com.sy;

public class Main {

    public static void main(String[] args) {

        String target = "We are happy";
        String result = ReplaceString.replaceSpace(target);
        System.out.println(result);

        ListNode pre = new ListNode();
        ListNode first = new ListNode();
        for (int i = 0; i < 4; i++) {
            int temp = (int) (Math.random() * 100);
            System.out.println(temp);
            ListNode node = new ListNode(temp);
            pre.next = node;
            pre = node;
            if (i == 0) {
                first = node;
            }
        }
        pre = pre.next;
        int [] arr = ReversLinkedList.reversePrint(first);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
