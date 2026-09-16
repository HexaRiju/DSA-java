package com.java.DSA.SortingAlgo;

import java.util.Arrays;
// quick sort using first element as the pivot
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort(arr , 0 ,  arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int start, int end){
        if(start >= end){
            return;
        }
        int m = devide(arr, start, end);
        quickSort(arr , start, m - 1);
        quickSort(arr , m + 1, end);
    }
    public static int devide(int[] arr ,int start , int end){
        int j = start;
        int pivot = start;
        for(int i = start; i <= end; i++){
            if(arr[i] < arr[pivot]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        return j;
    }
}
