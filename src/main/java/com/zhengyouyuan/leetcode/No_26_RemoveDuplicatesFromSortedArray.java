package com.zhengyouyuan.leetcode;

import java.util.Arrays;

public class No_26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2};
        int[] arr2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(Solution.removeDuplicates(arr1) + " => " + Arrays.toString(arr1));
        System.out.println(Solution.removeDuplicates(arr2) + " => " + Arrays.toString(arr2));
    }

    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int index = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[index] = nums[i + 1];
                    index++;
                }
            }
            return index;
        }
    }
}
