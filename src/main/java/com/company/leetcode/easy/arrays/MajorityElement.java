package com.company.leetcode.easy.arrays;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count += 1;
            } else {
                count += -1;
            }
        }
        return candidate;
    }
}
