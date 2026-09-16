package com.java.DSA.LeetCodeDebugging;

public class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            }
        }
        if(countZero > 1){
            for(int i = 0; i < nums.length; i++){
                nums[i] = 0;
            }
            return nums;
        }
        else if(countZero == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    continue;
                }
                product *= nums[i];
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    nums[i] = product;
                }
                else{
                    nums[i] = 0;
                }
            }
            return nums;
        }
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = product/nums[i];
        }
        return nums;
    }
}
