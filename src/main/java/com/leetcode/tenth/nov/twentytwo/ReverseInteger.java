package com.leetcode.tenth.nov.twentytwo;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverse;
        }
    }
}
