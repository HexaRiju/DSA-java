package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution23 {
    public int longestPalindrome(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxOdd = Integer.MIN_VALUE;
        for(int i = 0; i < map.size(); i++){
            if(map.get(s.charAt(i)) % 2 != 0)
                maxOdd = Math.max(maxOdd,map.get(s.charAt(i)));
        }
        int even = 0;
        for(int i = 0; i < map.size(); i++){
            if(map.get(s.charAt(i)) % 2 == 0)
                even += map.get(s.charAt(i));
        }
        return even + maxOdd;
    }
}
