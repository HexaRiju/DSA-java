package com.java.DSA.Recursion;

import java.util.Arrays;

public class Seclection_Sort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7};
        for(int i = 0; i < arr.length;i++){
            selectionSort(arr, 0, arr.length-1-i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr,int index ,int end,int max){
        if(index == end){
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;
            return;
        }
        else if(arr[max] < arr[index + 1]){
            max = index + 1;
        }
        selectionSort(arr,index+1,end,max);
    }
}
