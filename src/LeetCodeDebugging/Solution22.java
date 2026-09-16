package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution22 {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp,(a,b) ->{
            if(Integer.bitCount(a) != Integer.bitCount(b)){
                return Integer.bitCount(a) - Integer.bitCount(b);
            }
            return a.compareTo(b);
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
