package com.company.leetcode.easy.math;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int straight = number;
        boolean isPalindrome = false;
        while (number > 0) {
            reverse = (number % 10) + (reverse * 10);
            number /= 10;
        }
        if (reverse == straight) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
