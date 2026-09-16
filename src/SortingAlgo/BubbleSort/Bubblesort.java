package com.java.DSA.SortingAlgo.BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        sort(arr);
    }
    public static void sort(int[] arr){
        boolean b = false;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1; j < arr.length - i ; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = temp;
                    b = true;
                }
            }
            if(!b){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
