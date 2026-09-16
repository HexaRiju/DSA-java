package com.java.DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // first initilized the Arraylist
        for(int i = 0 ; i < 3 ; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr);
    }
}
