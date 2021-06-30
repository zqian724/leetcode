package com.zhengyouyuan.leetcode;

public class No_2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode i1 = new ListNode(9);
        ListNode i2 = new ListNode(9, i1);
        ListNode i3 = new ListNode(9, i2);
        ListNode i4 = new ListNode(9, i3);
        ListNode i5 = new ListNode(9, i4);
        ListNode i6 = new ListNode(9, i5);
        ListNode i7 = new ListNode(9, i6);


        ListNode j1 = new ListNode(9);
        ListNode j2 = new ListNode(9, j1);
        ListNode j3 = new ListNode(9, j2);
        ListNode j4 = new ListNode(9, j3);

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(i7, j4);

        ListNode i = i7;
        do {
            System.out.print(i.val);
            i = i.next;
        } while (i != null);

        System.out.print(" + ");

        ListNode j = j4;
        do {
            System.out.print(j.val);
            j = j.next;
        } while (j != null);

        System.out.print(" = ");

        do {
            System.out.print(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);
        System.out.println();
    }

    static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            boolean carry = false;
            ListNode listNode = null;
            ListNode temp = null;
            while (l1 != null || l2 != null){
                int num1 = l1 != null ? l1.val : 0;
                int num2 = l2 != null ? l2.val : 0;

                int addResult = num1 + num2;
                if (carry){
                    addResult++;
                }
                carry = addResult >= 10;
                if (listNode == null) {
                    listNode = new ListNode(addResult % 10);
                    temp = listNode;
                } else {
                    temp.next = new ListNode(addResult % 10);
                    temp = temp.next;
                }
                if (l1 != null){
                    l1 = l1.next;
                }
                if (l2 != null){
                    l2 = l2.next;
                }
            }
            if (carry){
                temp.next = new ListNode(1);
            }
            if (listNode == null){
                listNode = new ListNode(0);
            }
            return listNode;
        }
    }

    static class ListNode {
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

}