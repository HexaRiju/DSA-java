package com.java.DSA.Recursion;

public class No_ofZeros {
    public static void main(String[] args) {
        System.out.println(count(300002040,0));
    }
    public static int count(int n , int counter){
        if(n%10 == n){
            if(n == 0)
                return counter++;
            else
                return counter;
        }
        if(n%10 == 0)
            counter++;
        return count(n/10, counter);
    }
}
