package com.java.DSA.Searching.Binary_search;

public class Duplicate_Rotated_Array {

}
class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
        if(pivot == -1)
            return search1(nums , 0 , nums.length - 1, target);
        if(nums[pivot] == target)
            return pivot;
        else if(target >= nums[0])
            return search1(nums , 0 , pivot - 1, target);
        else
            return search1(nums , pivot + 1 , nums.length - 1, target);
    }
    public int findPivot(int[] arr){
        int mid =0,start = 0, end = arr.length -1 ;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int search1(int[] nums , int start , int end, int target ){
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
