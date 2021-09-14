package com.zhengyouyuan.leetcode.No_200;

import java.util.LinkedList;
import java.util.List;

public class No_145_BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> list = solution.postorderTraversal(root);
        System.out.println(list);
    }

    private static class TreeNode {
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

    private static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            LinkedList<Integer> listInOrder = new LinkedList<>();
            recursiveTraversal(root, listInOrder);
            return listInOrder;
        }

        private void recursiveTraversal(TreeNode node, LinkedList<Integer> list) {
            if (node == null) {
                return;
            }
            recursiveTraversal(node.left, list);
            recursiveTraversal(node.right, list);
            list.add(node.val);
        }
    }
}
