package com.leetcode.fifteen.nov.twentytwo;

public class NumberToRoman {
    public static void main(String[] args) {
        int x = 1994;
        System.out.println(intToRoman(x));
    }

    public static String intToRoman1(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    public static String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        String result = "";
        while(num > 0) {
            while(num >= value[i]) {
                num = num - value[i];
                result = result + roman[i];
            }
            i++;
        }
        return result;
    }
}
