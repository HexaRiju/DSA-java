package com.java.DSA.Recursion;

public class Serease {
    public static void main(String[] args) {
        forword(5);
        System.out.println();
        backword(5);
    }
    public static void forword(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        forword(n-1);
    }
    public static void backword(int n){
        if (n == 0){
            return;
        }
        backword(n-1);
        System.out.println(n);
    }
}
