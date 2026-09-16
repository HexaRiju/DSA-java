package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution43 {
    public int nextGreaterElement(int n) {
        String s = Integer.valueOf(n).toString();
        char[] ch = s.toCharArray();
        int min = ch.length - 2;
        while(min >= 0){
            if(ch[min] > ch[min+1]){
                min -= 1;
            }
            else{
                break;
            }
        }
        if(min == -1){
            return -1;
        }
        char[] arr = new char[ch.length - min - 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ch[min + i + 1];
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            ch[min + i + 1] =  arr[i];
        }
        for(int i = ch.length - 1; i >= min; i--){
            if(ch[min] >= ch[i]){
                char temp = ch[i + 1];
                ch[i + 1] = ch[min];
                ch[min] = temp;
                break;
            }
        }
        long res = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < ch.length; i++){
            sb.append(ch[i]);
        }
        res = Long.parseLong(sb.toString());
        if(res > Integer.MAX_VALUE || res == n){
            return -1;
        }
        return (int)res;
    }
}
