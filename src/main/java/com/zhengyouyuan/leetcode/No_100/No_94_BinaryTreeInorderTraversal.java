package com.zhengyouyuan.leetcode.No_100;

import java.util.LinkedList;

public class No_94_BinaryTreeInorderTraversal {

    static class Solution {
        public LinkedList<Integer> inorderTraversal(TreeNode root) {
            LinkedList<Integer> listInOrder = new LinkedList<>();
            recursiveTraversal(root, listInOrder);
            return listInOrder;
        }

        public void recursiveTraversal(TreeNode node, LinkedList<Integer> list) {
            if (node == null) {
                return;
            }
            recursiveTraversal(node.left, list);
            list.add(node.val);
            recursiveTraversal(node.right, list);

        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
