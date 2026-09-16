package com.java.DSA.LeetCodeDebugging;

public class Solution13 {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int minEat = 1;
        int maxEat = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > maxEat){
                maxEat = piles[i];
            }
        }
        while(minEat <= maxEat){
            int midEat = minEat + (maxEat - minEat)/2;
            long hr = takeTime(midEat,piles);
            if(hr <= h){
                maxEat =  midEat - 1;
                k = midEat;
            }
            else{
                minEat = midEat + 1;
            }
        }
        return  k;
    }
    public long takeTime(int midEat,int [] piles) {
        long hr = 0;
        for(int i = 0; i < piles.length; i++){
            hr = hr + piles[i]/midEat + (piles[i]%midEat==0?0:1);
        }
        return hr;
    }
}
