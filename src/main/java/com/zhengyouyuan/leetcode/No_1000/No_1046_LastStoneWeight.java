package com.zhengyouyuan.leetcode.No_1000;

import java.util.Arrays;

public class No_1046_LastStoneWeight {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,7,4,1,8,1};
        int[] arr2 = new int[]{1,1,1,1,1,1};
        int[] arr3 = new int[]{1};
        int[] arr4 = new int[]{1,2};
        int[] arr5 = new int[]{9,9,9,9};
        int[] arr6 = new int[]{9,9,9,9,9};
        System.out.println(Solution.lastStoneWeight(arr1));
        System.out.println(Solution.lastStoneWeight(arr2));
        System.out.println(Solution.lastStoneWeight(arr3));
        System.out.println(Solution.lastStoneWeight(arr4));
        System.out.println(Solution.lastStoneWeight(arr5));
        System.out.println(Solution.lastStoneWeight(arr6));
    }

    static class Solution {
        public static int lastStoneWeight(int[] stones) {
            if (stones.length == 1)
                return stones[0];
            if (stones.length == 2)
                return Math.abs(stones[0] - stones[1]);

            Arrays.sort(stones);
            int stone0 = stones[stones.length - 1];
            int stone1 = stones[stones.length - 2];
            if (stone0 == stone1){
                return lastStoneWeight(Arrays.copyOfRange(stones, 0, stones.length - 2));
            } else {
                int[] copy = Arrays.copyOfRange(stones, 0, stones.length - 1);
                copy[stones.length - 2] = stone0 - stone1;
                return lastStoneWeight(copy);
            }
        }
    }
}
