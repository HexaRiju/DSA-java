package com.java.DSA.Bitmanupulation;

import java.util.Scanner;

public class Find_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// given number
        int r = sc.nextInt();// base
        int N = (int)(Math.log(n) / Math.log(r)) + 1;
        System.out.println(N);
    }
}
