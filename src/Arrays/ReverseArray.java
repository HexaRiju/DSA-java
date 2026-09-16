package com.java.DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;
// two pointer methode
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int i = 0 , j = arr.length -1;
        while(i <= j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
