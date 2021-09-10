package com.zhengyouyuan.leetcode.No_100;

public class No_11_ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(Solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(Solution.maxArea(new int[]{1,1}));
        System.out.println(Solution.maxArea(new int[]{4,3,2,1,4}));
        System.out.println(Solution.maxArea(new int[]{1,2,1}));
    }

    static class Solution {
        public static int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int maxArea = 0;
            while (left < right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                maxArea = Math.max(maxArea, area);
                if (height[left] <= height[right]) {
                    ++left;
                } else {
                    --right;
                }
            }
            return maxArea;
        }
    }
}
