package com.zhengyouyuan.leetcode.No_100;

import java.util.HashMap;
import java.util.Map;

public class No_3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(Solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(Solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(Solution.lengthOfLongestSubstring(""));
    }

    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int maxLen = 0;
            int leftPointer = 0;
            int rightPointer = 0;
            Map<Character, Integer> characterMap = new HashMap<>();

            while (rightPointer < s.length()){
                char c = s.charAt(rightPointer);
                if (characterMap.containsKey(c)){
                    leftPointer = Math.max(characterMap.get(c), leftPointer);
                }
                maxLen = Math.max(maxLen, rightPointer - leftPointer + 1);
                characterMap.put(s.charAt(rightPointer), rightPointer + 1);
                rightPointer++;
            }
            return maxLen;
        }
    }
}
