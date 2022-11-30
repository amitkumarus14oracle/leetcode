package com.leetcode.tenth.nov.twentytwo;

import java.util.ArrayList;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert2(s, 3));
    }
    public static String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int k = (2*numRows) - 2;
        String result = "";
        for(int i = 0; i<numRows; i++) {
            int j = 0;
            while(i+j< s.length()) {
                result = result + s.charAt(j+i);
                int sec = j - i + k;
                if(i != 0 && i != numRows -1 && sec < s.length()) {
                    result += s.charAt(sec);
                }
                j+=k;
            }
        }
        return result;
    }

    public static String convert2(String s, int numRows) {
        ArrayList<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int c=0;
        while(c<s.length()){
            for(int i=0;i<numRows && c<s.length() ;i++,c++){
                list.get(i).append(s.charAt(c));
            }
            for(int i=numRows-2;i>=1 && c<s.length();i--,c++){
                list.get(i).append(s.charAt(c));
            }
        }
        String ans="";
        for(int i=0;i<numRows;i++){
            String str=new String(list.get(i));
            ans=ans+str;
        }

        return ans;
    }
}
