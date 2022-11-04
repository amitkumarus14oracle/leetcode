package com.leetcode.third.nov.twentytwo;

class RunningSum {
    public static void main(String as[]) {
        int[] input = {3,1,2,10,1};
        System.out.println(runningSum(input));
    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i< nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}