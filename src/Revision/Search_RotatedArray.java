package com.java.DSA.Revision;

public class Search_RotatedArray {
    public static void main(String[] args) {
        int i = search(new int[]{1, 3}, 3);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("Not found");
        }
    }

    public static int search(int[] nums, int target) {
//         int start = 0, end = nums.length - 1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(nums[mid] == target){
//                 return mid;
//             }
        //else{
//                 if(target > nums[end]){
//                     if(target < nums[mid]){// here a bound is creating  s < t < mid
//                         end = mid-1;
//                     }
//                     // but if that's not , it's mean s<t and mid < t , no bound , then we have to check about the mid , that where mid lie's
//                     else if(nums[mid] > nums[end] ){
//                         start = mid+1;
//                     }
//                     else{
//                         end = mid-1;
//                     }
//                 }
//                 else{
//                     if(target > nums[mid]){//here a bound is creating  mid < t < e
//                         start = mid+1;
//                     }
//                     // but if that's not , it's mean e > t and mid > t , no bound , then we have to check about the mid , that where mid lie's
//                     else if(nums[mid] > nums[end] ){
//                         start = mid+1;
//                     }
//                     else{
//                         end = mid-1;
//                     }
//                 }
        // or more simple
//                 if(nums[start] <= nums[mid]){// mid is present in the left sorted array.
//                     if(nums[start] <= target &&  target < nums[mid]){
//                         end = mid - 1;
//                     }
//                     else{
//                         start = mid + 1;
//                     }
//                 }
//                 else{
//                     if(nums[end]>= target && target > nums[mid]){
//                         start = mid + 1;
//                     }
//                     else{
//                         end = mid - 1;
//                     }
//                 }
//             }
//         }
//         return -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else {
                if (nums[mid] > nums[end]) {
                    if (target > nums[end] && target < nums[mid])
                        end = mid - 1;
                    else
                        start = mid + 1;
                } else {
                    if (target < nums[end] && target > nums[mid])
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
            }
        }
        return -1;
    }
}
