package com.java.DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Dimention_Arrays {
    public static void main(String[] args) {
        int [][] b = {
                {1,2,3},
                {4,5},
                {6,7,8,9,10}
        };
        int [][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        // input
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //or

        for(int row = 0 ; row <arr.length ; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }
        //or
        System.out.println();
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }

        System.out.println();
        for(int [] a : b){
            System.out.println(Arrays.toString(a));
        }
    }
}
