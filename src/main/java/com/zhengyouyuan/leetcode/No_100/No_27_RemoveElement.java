package com.zhengyouyuan.leetcode.No_100;

import java.util.Arrays;

public class No_27_RemoveElement {

    public static void main(String[] args) {
        int[] a1 = new int[]{3,2,2,3};
        int i1 = Solution.removeElement(a1, 3);
        System.out.println(i1 + " ==>" + Arrays.toString(a1));


        int[] a2 = new int[]{0,1,2,2,3,0,4,2};
        int i2 = Solution.removeElement(a2, 2);
        System.out.println(i2 + " ==>" + Arrays.toString(a2));
    }

    static class Solution {
        public static int removeElement(int[] nums, int val) {
            int index = 0;
            for(int num : nums){
                if(num != val){
                    nums[index++] = num;
                }
            }
            return index;
        }
    }
}
