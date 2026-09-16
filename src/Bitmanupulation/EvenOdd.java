package com.java.DSA.Bitmanupulation;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if((x & 1) != 0)
            System.out.println("this no s odd");
        else
            System.out.println("this no is even");
    }
}
