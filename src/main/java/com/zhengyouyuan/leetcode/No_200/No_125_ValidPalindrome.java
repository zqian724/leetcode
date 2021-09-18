package com.zhengyouyuan.leetcode.No_200;

public class No_125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(Solution.isPalindrome("aabaa"));
        System.out.println(Solution.isPalindrome("aaaa"));
        System.out.println(Solution.isPalindrome("aabca"));
        System.out.println(Solution.isPalindrome("race a car"));
    }

    private static class Solution {
        private static boolean isPalindrome(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                    stringBuilder.append(c);
                }
            }
            String string = stringBuilder.toString();
            String reverse = stringBuilder.reverse().toString();
            return reverse.equalsIgnoreCase(string);
        }
    }
}
