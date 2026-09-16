package com.java.DSA.LeetCodeDebugging;

import java.util.*;

public class Solution17 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        if (arr.length < 3) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[max] < arr[j + 1]) {
                    max = j + 1;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[max];
            arr[max] = temp;
            max = 0;
        }
        return arr[arr.length - 3];
    }
}
