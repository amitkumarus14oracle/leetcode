package com.leetcode.seventh.nov.twentytwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0)
        {
            return result;
        }
        HashMap<Character, String[]> digitMapping = new HashMap<>();
        digitMapping.put('2', new String[]{"a", "b", "c"});
        digitMapping.put('3', new String[]{"d", "e", "f"});
        digitMapping.put('4', new String[]{"g", "h", "i"});
        digitMapping.put('5', new String[]{"j", "k", "l"});
        digitMapping.put('6', new String[]{"m", "n", "o"});
        digitMapping.put('7', new String[]{"p", "q", "r", "s"});
        digitMapping.put('8', new String[]{"t", "u", "v"});
        digitMapping.put('9', new String[]{"w", "x", "y", "z"});
        solution(digitMapping, digits, result, 0, "");
        return result;
    }

    private static void solution(HashMap<Character, String[]> digitMapping, String digits, List<String> result, int index, String s) {
        if(index == digits.length()) {
            result.add(s);
            return;
        }
        String[] s1 = digitMapping.get(digits.charAt(index));
        for(int i =0; i < s1.length; i++) {
            solution(digitMapping, digits, result, index+1, s+s1[i]);
        }
    }
}
