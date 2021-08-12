package com.zhengyouyuan.leetcode;

import java.util.*;

public class No_20_ValidParentheses {

    public static void main(String[] args) {
//        System.out.println(Solution.isValid("()[]{}"));
//        System.out.println(Solution.isValid( "(]"));
//        System.out.println(Solution.isValid("()"));
//        System.out.println(Solution.isValid("{[]}"));
//        System.out.println(Solution.isValid("([)]"));
//        System.out.println(Solution.isValid("(("));
        System.out.println(Solution.isValid("){"));
    }

    static class Solution {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> map = new HashMap<>();
            map.put('{', '}');
            map.put('[', ']');
            map.put('(', ')');

            if (s.length() % 2 == 1) {
                return false;
            }
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if (map.containsKey(aChar)){
                    stack.push(aChar);
                } else {
                    if (stack.empty()){
                        return false;
                    }
                    Character left = stack.pop();
                    Character right = map.get(left);
                    if (!Objects.equals(right, aChar)){
                        return false;
                    }
                }
            }
            return stack.empty();
        }
    }
}
