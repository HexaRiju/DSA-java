package com.java.DSA.LeetCodeDebugging;

public class Solution11 {
    public int reachNumber(int target) {
        int numsMove = 0;
        int start = 0;
        target = Math.abs(target);
        while(start < target){
            numsMove++;
            start += numsMove;
        }
        while((start - target)%2 != 0){
            numsMove++;
            start += numsMove;
        }
        return numsMove;
    }
}
