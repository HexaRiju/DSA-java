package com.java.DSA.LeetCodeDebugging;

public class Solution18 {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length){
            if((nums[i]%2 == 0 && i%2 == 0) || (nums[i]%2 != 0 && i%2 != 0)){
                i++;
                j++;
            }
            else{
                j++;
                if((nums[j]%2 == 0 && j%2 == 0) || (nums[j]%2 != 0 && j%2 != 0))
                    j++;
                else{
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                    i = j;
                }
            }
        }
        return nums;
    }
}
