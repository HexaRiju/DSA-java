package com.java.DSA.SortingAlgo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int c = arr[i] - 1;
            if(arr[i] != arr[c] ){
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
