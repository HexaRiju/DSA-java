package com.java.DSA.Arrays;
//https://leetcode.com/problems/richest-customer-wealth/
public class Question2 {
    public static void main(String[] args) {

    }
    //ans --
    public int maximumWealth(int[][] accounts) {
        int m = Integer.MIN_VALUE;
        int sum = 0;
        for(int[] arr : accounts){
            for(int ar : arr){
                sum += ar;
            }
            m = Math.max(sum , m);
            sum = 0;
        }
        return m;
    }
}
