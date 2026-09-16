package com.java.DSA.Recursion;

public class ReverseNumber {
    public static void main(String[] args){
        reverse(12345);
        System.out.println();
        System.out.println(reverse2(1234,0));
    }
    public static void reverse(int n){
        if(n == 0){
           return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
    public static int reverse2(int n, int sum){
        if(n%10 == n){
            return (sum + n);
        }
        sum = (sum + n%10)*10;
        return reverse2(n/10, sum);
    }
}
