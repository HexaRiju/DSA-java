package com.java.DSA.Recursion;

public class Rotating_point_of_an_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(rotate(arr,0,arr.length-1)+1);
    }
    public static int rotate(int[] arr , int s, int e){
        if (arr[s] <= arr[e]) {
            return -1;
        }

        int mid = s + (e-s)/2;
        if(mid == arr.length -1 || mid == 0){
            return mid;
        }
        else if((arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])){
            return mid;
        }
        else {
            if (arr[mid] >= arr[s]) {
                return rotate(arr, mid + 1, e);
            } else {
                return rotate(arr, s, mid - 1);
            }
        }
    }
}
