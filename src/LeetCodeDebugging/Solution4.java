package com.java.DSA.LeetCodeDebugging;

public class Solution4 {
    public void rotate(int[] nums, int k) {
        if(k % nums.length == 0)
            return;
        else {
            k = k % nums.length;
            int[] arr = new int[nums.length];
            int r = 0;
            for (int i = nums.length - k; i < nums.length; i++) {
                arr[r++] = nums[i];
            }
            for (int i = 0; i < nums.length - k; i++) {
                arr[r++] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = arr[i];
            }
        }
    }
}
