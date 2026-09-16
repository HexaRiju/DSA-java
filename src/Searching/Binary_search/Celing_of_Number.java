package com.java.DSA.Searching.Binary_search;

public class Celing_of_Number {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int [] arr1 = {18,16,14,9,5,3,2};
        int target = 15;
        System.out.println("the index of the celing of the number "+target + " is "+search(arr , target));
    }
    public static int search (int[] arr , int target){
        int mid = 0 ,start = 0 , end = arr.length -1;
        boolean isAssending = arr[start] < arr[end];
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAssending){
                if(arr[mid] > target){
                    end = mid - 1;
                }
                else if(arr[mid] < target){
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else if(arr[mid] < target){
                    end = mid - 1;
                }
            }
        }
//        if(isAssending){
//            if(arr[mid] > target){
//                return mid;
//            }
//            else{
//                return mid + 1;
//            }
//        }
//        else{
//            if(arr[mid] > target){
//                return mid;
//            }
//            else{
//                return mid - 1;
//            }
//        }
        //or
        if(isAssending)
            return start;
        else
            return end;
    }
}
