package com.zhengyouyuan.leetcode.No_200;

import java.util.HashSet;
import java.util.Set;

public class No_136_SingleNumber {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,2,1};
        int[] arr2 = new int[]{4,1,2,1,2};

        System.out.println(Solution.singleNumber(arr1));
        System.out.println(Solution.singleNumber(arr2));
    }

    static class Solution {
        public static int singleNumber(int[] nums) {
            Set<Integer> set = new HashSet<>(nums.length);
            for (int num : nums) {
                if (!set.add(num)){
                    set.remove(num);
                }
            }
            return set.iterator().next();
        }
    }
}
