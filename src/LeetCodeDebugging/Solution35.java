package com.java.DSA.LeetCodeDebugging;

public class Solution35 {
    public int romanToInt(String s) {
        int n = number(s.charAt(s.length()-1));
        for(int i = 0; i < s.length()-1; i++){
            int j = number(s.charAt(i));
            int k = number(s.charAt(i + 1));
            if(j >= k){
                n += j ;
            }
            else{
                n -= j;
            }
        }
        return n;
    }
    public int number(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
}
