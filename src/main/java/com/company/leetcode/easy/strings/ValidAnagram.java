package com.company.leetcode.easy.strings;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        boolean isFound = false;
        int sCount = 0;
        int tCount = 0;
        if (s.length() != t.length()) return isFound;
        for (int i = 0; i < s.length(); i++) {
            isFound = false;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sCount++;
                }
                if (s.charAt(i) == t.charAt(j)) {
                    tCount++;
                }
            }
            if (sCount != tCount) {
                return isFound;
            } else {
                isFound = true;
            }

        }
        return isFound;
    }



}
