package com.java.DSA.LeetCodeDebugging;

import java.util.*;
public class Solution25 {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        boolean b = true;
        int low = 0, high = 0,longestSubString = Integer.MIN_VALUE;
        while(high < s.length()){
            if(b)
                map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            if(map.size() < k){
                high++;
                b = true;
            }
            else if(map.size() > k){
                low++;
                map.put(s.charAt(low - 1),map.getOrDefault(s.charAt(low - 1),0)-1);
                if(map.getOrDefault(s.charAt(low - 1),0) == 0){
                    map.remove(s.charAt(low - 1));
                }
                b = false;
            }
            else{
                longestSubString = Math.max(longestSubString,(high - low + 1));
                high++;
                b = true;
            }
        }
        if(longestSubString == Integer.MIN_VALUE)
            return - 1;
        return longestSubString;
    }
}
