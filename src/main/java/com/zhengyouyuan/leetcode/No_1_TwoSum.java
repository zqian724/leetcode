package com.zhengyouyuan.leetcode;

import java.util.Arrays;

public class No_1_TwoSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(array, target);
        System.out.println(Arrays.toString(result));
    }

     static class Solution {
         public int[] twoSum(int[] nums, int target) {
             int i, j, sum;
             for (i = 0; i < nums.length; i++) {
                 for (j = i + 1; j < nums.length; j++) {
                     sum = nums[i] + nums[j];
                     if (sum == target) {
                         return new int[]{i, j};
                     }
                 }
             }
             throw new IllegalArgumentException("No solution");
         }
    }
}