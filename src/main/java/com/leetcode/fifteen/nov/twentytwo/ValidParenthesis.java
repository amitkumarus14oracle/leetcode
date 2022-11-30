package com.leetcode.fifteen.nov.twentytwo;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid(")("));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i =0; i< s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{' ) || (s.charAt(i) == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
