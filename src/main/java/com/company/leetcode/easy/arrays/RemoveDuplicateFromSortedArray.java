package com.company.leetcode.easy.arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
                System.out.println(nums[i]);
            }

        }

        return k;
    }

}
