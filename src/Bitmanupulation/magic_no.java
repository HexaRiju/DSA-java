package com.java.DSA.Bitmanupulation;

import java.util.Scanner;

public class magic_no {
    public static void main(String[] arg){
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        double sum = 0;
        for(int i = 1; x > 0                        ; i++){
            sum = (x & 1) * Math.pow(5,i)+ sum;
            x = x >> 1;
        }
        System.out.println(sum);
    }
}
