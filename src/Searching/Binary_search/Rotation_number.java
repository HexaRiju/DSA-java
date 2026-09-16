package com.java.DSA.Searching.Binary_search;

public class Rotation_number {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        Rotation_number rotationNumber = new Rotation_number();
        System.out.println("the number of rotations in the array is "+(rotationNumber.findPivot(arr)+1));
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
}
