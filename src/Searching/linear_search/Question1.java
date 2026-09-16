package com.java.DSA.Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1944027882/
public class Question1 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);
    }
    // ans --
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(Integer a : nums){
            if((int)(Math.log10(a)+1) %2 == 0)
                count++;
        }
        return count;
    }
}

