package com.zhengyouyuan.leetcode.No_200;

import java.util.LinkedList;
import java.util.List;

public class No_144_BinaryTreePreorderTraversal {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> list = solution.preorderTraversal(root);
        System.out.println(list);
    }

    public static class TreeNode {
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

    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            LinkedList<Integer> listInOrder = new LinkedList<>();
            recursiveTraversal(root, listInOrder);
            return listInOrder;
        }

        private void recursiveTraversal(TreeNode node, LinkedList<Integer> list) {
            if (node == null) {
                return;
            }
            list.add(node.val);
            recursiveTraversal(node.left, list);
            recursiveTraversal(node.right, list);
        }
    }
}
