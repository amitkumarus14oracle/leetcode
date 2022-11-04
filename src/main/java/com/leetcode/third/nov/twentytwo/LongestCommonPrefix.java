package com.leetcode.third.nov.twentytwo;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
