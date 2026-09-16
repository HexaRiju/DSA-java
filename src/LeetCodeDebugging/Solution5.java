package com.java.DSA.LeetCodeDebugging;

public class Solution5 {
    public void sortColors(int[] nums) {
        int R = 0, W = 1, B = 2;
        int i = 0;
        int j = nums.length - 1;
        fastSort(nums,i,j, 0);
        while(i < nums.length){
            if(nums[i] == 0)
                i++;
            else
                break;
        }
        fastSort(nums,i ,j,1);
    }
    public void fastSort(int[] arr ,int i, int j, int n){
        while(i < j){
            if(arr[i] == n && arr[j] == n){
                i++;
            }
            else if(arr[i] != n && arr[j] == n){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i] == n && arr[j] != n){
                i++;
                j--;
            }
            else{
                j--;
            }
        }
    }
}
