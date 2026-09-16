package com.java.DSA.Recursion;

public class Array_is_Sorted {
    public static void main(String[] args){
        System.out.println(sorted(new int[] {1,2,3,5,4,6},0));
    }
    public static boolean sorted(int[] arr ,int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
