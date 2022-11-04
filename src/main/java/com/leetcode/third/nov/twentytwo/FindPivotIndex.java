package com.leetcode.third.nov.twentytwo;

public class FindPivotIndex {
    public static void main(String as[]) {
        int[] input = {1,7,3,6,5,6};
        System.out.println(pivotIndex(input));
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        int rightSum = sum - nums[0];
        if(leftSum == rightSum)
            return 0;
        for(int i = 1; i < nums.length; i++) {
            leftSum = leftSum + nums[i-1] ;
            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
