package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution14 {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long absDiff = 0,store = 0;
        int[] partical = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            partical[i] = nums1[i];
        }
        Arrays.sort(partical);
        for(int i = 0; i < nums1.length; i++ ){
            absDiff += Math.abs(nums1[i]-nums2[i]);
        }
        if(absDiff == 0){
            return 0;
        }
        store  = absDiff;
        for(int i = 0; i < nums1.length; i++ ){
            int l = 0, r = partical.length - 1;
            int mid = 0;
            int bestDiff = Integer.MAX_VALUE;
            while(l <= r){
                mid = l + (r - l)/2;
                int x = nums2[i] - partical[mid];
                bestDiff = Math.min(bestDiff,Math.abs(x));
                if(x == 0){
                    bestDiff = 0;
                    break;
                }
                else if( x < 0){
                    r = mid - 1;
                }
                else{
                    l =  mid + 1;
                }
            }
            store = Math.min(store,absDiff - Math.abs(nums1[i]-nums2[i]) + bestDiff);
        }
        return (int)(store % 1_000_000_007);
    }
}
