package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution38 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        int[] arr = new int[k];
        Arrays.fill(arr,Integer.MIN_VALUE);
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0) + 1);
        for(int i = 0; i < k; i++){
            int t = nums[0];
            for(int j: map.keySet()){
                if(arr[k] != j && map.get(t) < map.get(j))
                    t = j;
            }
            arr[k] = t;
        }
        return arr;
    }
}
