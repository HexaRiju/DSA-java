package com.java.DSA.Recursion;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args){
        int[]arr = {5,4,3,2,1};
        for(int j=0;j<arr.length;j++){
            if(!bubbleSort(arr,0,false, arr.length-1-j))
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean bubbleSort(int[] arr , int index , boolean flag , int end){
        if(index == end){
            return flag;
        }
        if(arr[index] > arr[index + 1]){
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
            flag = true;
        }
        return bubbleSort(arr, index+1,flag, end);
    }
}
