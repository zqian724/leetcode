package com.zhengyouyuan.leetcode.No_100;

public class No_9_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(121));
        System.out.println(Solution.isPalindrome(1221));
        System.out.println(Solution.isPalindrome(1231));
        System.out.println(Solution.isPalindrome(12421));
    }

    static class Solution {
        public static boolean isPalindrome(int x) {
            int m = x;
            if (x < 0)
                return false;
            int k = 0;
            while (x > 0) {
                k = x % 10 + k * 10;
                x /= 10;
            }
            return m == k;
        }
    }
}
