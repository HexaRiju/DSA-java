package com.java.DSA.LeetCodeDebugging;

import java.util.HashMap;
import java.util.Map;

public class Solution47 {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, length = 0, maxL = 0;
        boolean b = true;
        while(j < s.length()){
            int maxFrq  = 0;
            if(b)
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            length = j - i + 1;
            for(int p = 0; p < 26; p++){
                maxFrq = Math.max(maxFrq, map.getOrDefault((char)('A' + p) , 0));
            }
            if(length - maxFrq <= k){
                maxL = Math.max(maxL , length);
                j++;
                b = true;
            }
            else{
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                i++;
                b = false;
            }
        }
        return maxL;
    }
}
