package com.company.leetcode.easy.strings;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}
