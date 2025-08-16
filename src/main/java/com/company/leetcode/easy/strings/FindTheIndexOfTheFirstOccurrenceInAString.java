package com.company.leetcode.easy.strings;
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if (index >= 0) {
            return index;
        } else {
            return -1;
        }
    }
}
