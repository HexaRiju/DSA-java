package com.java.DSA.Searching.Binary_search;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int s = search(arr,18,ans(arr,18));
        System.out.println(s);
    }
    public static int[] ans(int[] arr,int target) {
        int start = 0;
        int end = 1;
        int[] a = {0,1};
        while(true){
            try {
                if (target <= arr[end])
                    break;
                start = end + 1;
                end = 2 * start + 1;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                break;
            }
        }
        a[0] = start;
        a[1] = end;
        return a;
    }
    public static int search(int [] arr , int target,int[] a ){
        int start = a[0], end = a[1];
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
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
