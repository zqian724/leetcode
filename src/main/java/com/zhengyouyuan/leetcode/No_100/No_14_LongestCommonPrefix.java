package com.zhengyouyuan.leetcode.No_100;

import java.util.Arrays;
import java.util.Comparator;

public class No_14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArr1 = new String[]{"flower","flow","flight"};
        String[] strArr2 = new String[]{"dog","racecar","car"};

        System.out.println(Solution.longestCommonPrefix(strArr1));
        System.out.println(Solution.longestCommonPrefix(strArr2));
    }

    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
            String result = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if (result.length() == 0) {
                    return result;
                }
                if (strs[i].startsWith(result)){
                    continue;
                }
                result = result.substring(0, result.length() - 1);
                i--;
            }
            return result;
        }
    }
}
