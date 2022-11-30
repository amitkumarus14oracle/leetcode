package com.leetcode.tenth.nov.twentytwo;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "a";
        String p = ".*..a*";
        System.out.println(isMatch(s, p));
    }
    public static boolean isMatch(String s, String p) {
        if(s.length() == p.length()  && s.length() == 0)
            return true;
        boolean[][] mat = new boolean[s.length()+1][p.length()+1];
        mat[0][0] = true;
        for(int j = 2; j<p.length()+1; j++){
            mat[0][j] = p.charAt(j-1) == '*' && mat[0][j-2];
        }
        for(int j =1; j<p.length()+1; j++) {
            for(int i=1; i <s.length()+1; i++) {
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
                    mat[i][j] = mat[i-1][j-1];
                } else if(p.charAt(j-1) == '*') {
                    mat[i][j] = mat[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && mat[i-1][j]);
                }
            }
        }
        return mat[s.length()][p.length()];
    }
}
