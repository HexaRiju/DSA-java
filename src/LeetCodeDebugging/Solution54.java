package com.java.DSA.LeetCodeDebugging;

import java.util.HashMap;
import java.util.Map;

public class Solution54 {
    public int minimumRecolors(String block, int k) {
        int minChange = Integer.MAX_VALUE, i = 0, j = k - 1;
        Map<Character, Integer> map = new HashMap<>();
        for(int l = 0; l < k; l++){
            map.put(block.charAt(l), map.getOrDefault(block.charAt(l), 0) + 1);
        }
        if(k == 1){
            for(int l = 0; l < block.length(); l++){
                if(block.charAt(l) == 'B')
                    return 0;
            }
            return 1;
        }
        while(j < block.length()){
            if(map.get('B') == k)
                return 0;
            else{
                    minChange = Math.min(k - map.get('B'), minChange);
            }
            map.put(block.charAt(i), map.getOrDefault(block.charAt(i), 0) - 1);
            i++;
            j++;
            if(j < block.length())
                map.put(block.charAt(j), map.getOrDefault(block.charAt(j), 0) + 1);
        }
        return minChange;
    }
}
