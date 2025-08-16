package com.company.leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
    public List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> nums = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    nums.add(1);
                } else {
                    int value = list.get(i - 1).get(j) + list.get(i - 1).get(j - 1);
                    nums.add(value);
                }
            }
            list.add(nums);
        }
        return list.get(rowIndex-1);
    }


}
