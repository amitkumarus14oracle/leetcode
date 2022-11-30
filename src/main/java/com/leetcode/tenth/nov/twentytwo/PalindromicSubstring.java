package com.leetcode.tenth.nov.twentytwo;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if(s.length() <= 1) {
            return s;
        }
        int maxLength = 0;
        int start = 0;
        //for odd length
        for(int i = 0; i< s.length(); i++) {
            int l = i;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLength) {
                maxLength = len;
                start = l+1;
            }
        }
        //for even length
        for(int i = 0; i< s.length(); i++) {
            int l = i;
            int r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLength) {
                maxLength = len;
                start = l+1;
            }
        }
        return s.substring(start, start+maxLength);
    }
}
