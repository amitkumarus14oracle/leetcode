package com.leetcode.tenth.nov.twentytwo;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "     -42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int index = 0;
        while(index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        boolean isPositive = true;
        if(index < s.length() && s.charAt(index) == '-') {
            isPositive = false;
            index++;
        } else if(index < s.length() && s.charAt(index) == '+') {
            index++;
        }
        int result = 0;
        while(index < s.length() && isDigit(s.charAt(index))) {
            int digit = Character.getNumericValue(s.charAt(index));
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > 7)) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = (result*10)+ digit;
            index++;
        }
        return isPositive ? result : -result;
    }

    public static boolean isDigit(char c) {
        int digit = c - 48;
        return digit >= 0 && digit <=9;
    }
}
