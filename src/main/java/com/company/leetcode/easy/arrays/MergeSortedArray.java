package com.company.leetcode.easy.arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int k = 0; k < nums1.length - i - 1; k++) {
                if (nums1[k] > nums1[k + 1]) {
                    int temp = nums1[k];
                    nums1[k] = nums1[k + 1];
                    nums1[k + 1] = temp;
                }
            }
        }
    }


}
