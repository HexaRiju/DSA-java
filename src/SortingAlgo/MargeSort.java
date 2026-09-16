package com.java.DSA.SortingAlgo;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        margeSort(arr , 0 ,  arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void margeSort(int[] arr , int start , int end){
        int mid = start + (end - start)/2;
        if(start >= end){
            return;
        }
        margeSort(arr, start, mid );
        margeSort(arr, mid + 1, end);
        marge(arr, start, mid, end );
    }
    public static void marge(int[] arr , int start ,int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] a = new int[arr.length];
        while(i < mid+1 && j < end + 1){
            if(arr[i] >= arr[j]){
                a[k++] = arr[j++];
            }
            else{
                a[k++] = arr[i++];
            }
        }
        while(i < mid+1){
            a[k++] = arr[i++];
        }
        while(j < end + 1){
            a[k++] = arr[j++];
        }
        k = start;
        while(k < end + 1){
            arr[k] = a[k];
            k++;
        }
    }
}
