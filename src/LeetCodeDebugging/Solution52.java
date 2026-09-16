package com.java.DSA.LeetCodeDebugging;

import java.util.HashSet;
import java.util.Set;

public class Solution52 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        while(j < nums.length){
            while(j - i > k){
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            int length = j - i + 1;
            if(length > set.size())
                return true;
            j++;
        }
        return false;
    }
}
