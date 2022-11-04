package com.leetcode.third.nov.twentytwo;

public class PalindromeCheck {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuffer s1 = new StringBuffer(s);
        String s2 = s1.reverse().toString();
        return s.equals(s2);
    }
}
