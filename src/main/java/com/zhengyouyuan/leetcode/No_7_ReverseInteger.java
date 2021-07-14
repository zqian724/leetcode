package com.zhengyouyuan.leetcode;

public class No_7_ReverseInteger {

    public static void main(String[] args) {
        System.out.println(Solution.reverse(14564564));
    }

    static class Solution {
        public static int reverse(int x) {
            long answer = 0;
            while (x != 0) {
                answer = answer * 10 + x % 10;
                x /= 10;
                if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) answer;
        }
    }
}
