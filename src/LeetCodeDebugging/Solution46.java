package com.java.DSA.LeetCodeDebugging;

public class Solution46 {
    public int trap(int[] height) {
        int n = height.length, trappedWater = 0;
//        int[] maxLeft = new int[n], maxRight = new int[n], minHeight = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (i == 0)
//                maxLeft[0] = 0;
//            else
//                maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
//        }
//        for (int i = n - 1; i >= 0; i--) {
//            if (i == n - 1)
//                maxRight[i] = 0;
//            else
//                maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
//        }
//        for (int i = 0; i < n; i++) {
//            minHeight[i] = Math.min(maxLeft[i], maxRight[i]);
//            trappedWater += (Math.max(minHeight[i] - height[i], 0));
//        }
        int l = 0, r = n - 1;
        int maxLeft = 0, maxRight = 0;
        while(l < r){
            if(maxLeft <= maxRight){
                trappedWater += Math.max(maxLeft - height[l], 0);
                maxLeft = Math.max(maxLeft , height[l]);
                l++;
            }
            else{
                trappedWater += Math.max(maxRight - height[r], 0);
                maxRight = Math.max(maxRight , height[r]);
                r--;
            }
        }
        return trappedWater;
    }
}
