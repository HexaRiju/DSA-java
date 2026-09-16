package com.java.DSA.Searching.Binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 10, 11, 32, 55, 78};
        int[] arr2 = {78,55,32,11,10,9,4,1};
        System.out.println(search(arr2,4));
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
        return -1;
    }
}
