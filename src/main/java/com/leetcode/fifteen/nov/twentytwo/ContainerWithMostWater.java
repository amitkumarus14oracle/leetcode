package com.leetcode.fifteen.nov.twentytwo;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] h = {1,1};
        System.out.println(maxArea(h));
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        /*for(int i=0; i<height.length; i++) {
            for(int j =i+1; j<height.length; j++) {
                int overlapHeight = height[i] > height[j] ? height[j] : height[i];
                int area = overlapHeight * (j-i);
                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;*/
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int area = (j - i) *  Math.min(height[i], height[j]);
            if(height[i] == height[j]) {
                i++;
                j--;
            } else if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
            if(area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
