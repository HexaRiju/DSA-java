package com.java.DSA.SortingAlgo.SelectionSort;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        sort(arr);
    }
    public static void sort(int[] arr){
//        for(int i = 0 ; i < arr.length ; i++){
//            int t = i;
//            for(int j = i + 1 ; j < arr.length ; j++){
//                if(arr[t] > arr[j]){
//                    t = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[t];
//            arr[t] = temp;
//        }
        // more easy
        for(int i = 0; i < arr.length-1; i++){
            int max = 0;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length- 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
