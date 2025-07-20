package com.company.leetcode.easy;
public class TwoSum {
    public static int[] withArray(int[] nums, int target) {
        boolean found = false;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return result;
    }
}
