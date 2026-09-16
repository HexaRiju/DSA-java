package com.java.DSA.LeetCodeDebugging;

import java.util.*;
public class Solution41 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int[] n = new int[set.size()];
        int l = 0;
        for(int i : set)
            n[l++] = i;
        Arrays.sort(n);
        int i = 0, j = 0, max = 0;
        while(j < n.length){
            if( j != n.length - 1 && n[j + 1] == n[j] + 1){
                j++;
            }
            else{
                max = Math.max(max, j - i + 1);
                j++;
                i = j;
            }
        }
        if(max == 1)
            return 0;
        return max;
    }
}
