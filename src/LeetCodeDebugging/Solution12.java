package com.java.DSA.LeetCodeDebugging;

public class Solution12 {
    public int maxValue(int n, int index, int maxSum) {
        long eR = n - 1 - index;
        long eL = index;
        long upperBound = maxSum;
        long lowerBound = 1;// as need positive integer.
        int result = 0;
        while(lowerBound <= upperBound){
            long mid = lowerBound + (upperBound - lowerBound)/2;
            long e = mid - 1;
            long rightSum = 0;
            if(e >= eR){
                rightSum = (e*(e + 1))/2 - ((e - eR)*(e - eR +1))/2;
            }
            else{
                rightSum = (e*(e + 1))/2 + (eR - e);
            }
            long leftSum = 0;
            if(e >= eL){
                leftSum = (e*(e + 1))/2 - ((e - eL)*(e - eL +1))/2;
            }
            else{
                leftSum = (e*(e + 1))/2 + (eL - e);
            }
            long sum = leftSum + mid + rightSum;

            if(sum <= maxSum){
                lowerBound = mid + 1;
                result = (int)mid;
            }
            else{
                upperBound = mid - 1;
            }
        }
        return result;
    }
}
