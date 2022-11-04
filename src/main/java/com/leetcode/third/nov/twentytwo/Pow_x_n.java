package com.leetcode.third.nov.twentytwo;

public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2.1000, -2));
    }

    public static double myPow(double x, int n) {
        /*int absN = n >= 0 ? n : -1*n;
        double absRes = 1;
        for(int i = 0; i<absN; i++) {
            absRes = absRes * x;
        }
        if(n >= 0) {
            return absRes;
        } else {
            return 1/absRes;
        }*/

        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }
}
