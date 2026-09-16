package com.java.DSA.LeetCodeDebugging;

public class Solution16 {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE, right = 0;
        int minCapasity = 0, day = 0;
        for(int i = 0; i < weights.length; i++){
            if(left < weights[i]){
                left = weights[i];
            }
            right += weights[i];
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            day = possible(mid , weights);
            if(day <= days){
                right = mid - 1;
                minCapasity = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return minCapasity;
    }
    public int possible (int capasity, int[] weights){
        int days = 0;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            if(sum > capasity){
                days++;
                sum = weights[i];
            }
        }
        if(sum != 0)
            days++;
        return days;
    }
}
