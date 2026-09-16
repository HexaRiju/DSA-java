package com.java.DSA.Recursion;

public class Palindrom {
    public static void main(String [] args){
        if (12321 == reverse2(12321,0))
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static int reverse2(int n, int sum){
        if(n%10 == n){
            return (sum + n);
        }
        sum = (sum + n%10)*10;
        return reverse2(n/10, sum);
    }
}
