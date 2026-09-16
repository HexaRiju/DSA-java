package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution29 {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int high = 0, low = 0;
        boolean b = true;
        int max = Integer.MIN_VALUE;
        while(high < fruits.length){
            if(b)
                map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            if(map.size() < 2 || map.size() == 2){
                max = Math.max(max,high - low + 1);
                high++;
                b = true;
            }
            else{
                map.put(fruits[low],map.getOrDefault(fruits[low],0)-1);
                if(map.getOrDefault(fruits[low],0) == 0){
                    map.remove(fruits[low]);
                }
                low++;
                b = false;
            }
        }
        return max;
    }
}
