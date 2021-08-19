package com.zhengyouyuan.leetcode;

public class No_58_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLastWord( "a"));
        System.out.println(Solution.lengthOfLastWord( "Hello World"));
        System.out.println(Solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(Solution.lengthOfLastWord("luffy is still joyboy"));
    }

    static class Solution {
        public static int lengthOfLastWord(String s) {
            char[] chars = s.toCharArray();
            int num = 0;
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == ' ' && num > 0){
                    return num;
                }
                if (chars[i] != ' '){
                    num++;
                }
            }
            return num;
        }
    }
}
