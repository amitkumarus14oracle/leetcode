package com.leetcode.seventh.nov.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for(int i =0 ;i< nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                long remTarget = (long)target - nums[i] - nums[j];
                int low = j+1;
                int high = nums.length -1;
                while(low < high) {
                    int sum = nums[low] + nums[high];
                    if(sum > remTarget)
                        high--;
                    else if (sum < remTarget)
                        low++;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[low], nums[high]);
                        result.add(quad);
                        while(low < high && nums[low] == quad.get(2)) low++;
                        while(low < high && nums[high] == quad.get(3)) high--;
                    }
                }
                while(j+1 < nums.length && nums[j] == nums[j+1]) j++;
            }
            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        }
        return result;
    }
}
