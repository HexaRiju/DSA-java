package com.java.DSA.Searching.Binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 10, 11, 32, 55, 78};
        System.out.println(search(arr,4));
    }
    public static int search(int [] arr , int target ){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;// this is doing because in jave if we do (start + end)/2
            // the (start + end ) may excide the range of int
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
