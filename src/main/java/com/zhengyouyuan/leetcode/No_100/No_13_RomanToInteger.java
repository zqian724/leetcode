package com.zhengyouyuan.leetcode.No_100;

import java.util.HashMap;
import java.util.Map;

public class No_13_RomanToInteger {

    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("III"));
        System.out.println(Solution.romanToInt("IV"));
        System.out.println(Solution.romanToInt("IX"));
        System.out.println(Solution.romanToInt("LVIII"));
        System.out.println(Solution.romanToInt("MCMXCIV"));
    }

    static class Solution {
        public static int romanToInt(String s) {
            Map<String, Integer> map = new HashMap<>();map.put("I", 1);
            map.put("IV", 4);
            map.put("V", 5);
            map.put("IX", 9);
            map.put("X", 10);
            map.put("XL", 40);
            map.put("L", 50);
            map.put("XC", 90);
            map.put("C", 100);
            map.put("CD", 400);
            map.put("D", 500);
            map.put("CM", 900);
            map.put("M", 1000);

            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && map.containsKey(s.substring(i, i + 2))) {
                    res += map.get(s.substring(i, i + 2));
                    i++;
                } else {
                    res += map.get(s.substring(i, i + 1));
                }
            }
            return res;
        }
    }
}
