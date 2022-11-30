package com.leetcode.seventh.nov.twentytwo;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] a = {-100,-98,-2,-1};
        System.out.println(threeSumClosest(a, -101));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length < 3) {
            return 0;
        }
        int sum;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum - target) < Math.abs(diff)) {
                    diff = sum - target;
                }
                if(sum > target) {
                    k--;
                }
                if(sum < target) {
                    j++;
                }
            }
        }
        return diff + target;
    }
}
