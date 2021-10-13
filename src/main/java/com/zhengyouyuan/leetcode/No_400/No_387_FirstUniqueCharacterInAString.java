package com.zhengyouyuan.leetcode.No_400;

import java.util.LinkedHashMap;
import java.util.Map;

public class No_387_FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(Solution.firstUniqChar("leetcode"));
        System.out.println(Solution.firstUniqChar("loveleetcode"));
        System.out.println(Solution.firstUniqChar("aabb"));
    }

    private static class Solution {
        private static int firstUniqChar(String s) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char c : s.toCharArray()) {
                map.merge(c, 1, Integer::sum);
            }
            return map.entrySet().stream().filter(it -> it.getValue() == 1).map(Map.Entry::getKey)
                    .findFirst().map(s::indexOf).orElse(-1);
        }
    }
}
