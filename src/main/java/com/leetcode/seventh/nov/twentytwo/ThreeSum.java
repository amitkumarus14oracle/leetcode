package com.leetcode.seventh.nov.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] s = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(s));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 3) {
            return result;
        }
        if(nums[0] > 0) {
            return result;
        }
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] > 0)
                break;
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                int requiredSum = nums[i] + nums[j] + nums[k];
                if(requiredSum < 0){
                    j++;
                } else if(requiredSum > 0){
                    k--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);
                    int lastLowOccurence = nums[j];
                    int lastHighOccurence = nums[k];
                    while(j < k && lastLowOccurence == nums[j]){
                        j++;
                    }
                    while(j < k && lastHighOccurence == nums[k]){
                        k--;
                    }
                }
            }
        }
        return result;
    }
}
