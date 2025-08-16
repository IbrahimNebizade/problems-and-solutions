package com.company.leetcode.easy.arrays;

public class SearchInsertPosition {


    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean isFound = false;
        int prev = nums[0];
        if (nums[nums.length - 1] < target) {
            return nums.length;
        } else if (nums[0] > target) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    result = i;
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                for (int i = 1; i < nums.length; i++) {
                    if (target > prev && target < nums[i]) {
                        result++;
                        break;
                    } else {
                        prev = nums[i];
                        result++;
                    }
                }
            }
        }
        return result;
    }

}
