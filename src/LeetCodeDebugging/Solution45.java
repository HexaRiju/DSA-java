package com.java.DSA.LeetCodeDebugging;

public class Solution45 {
    public boolean canTransform(String start, String result) {
        int i = 0, j = 0;
        char[] ch = start.toCharArray();
        while(i < ch.length && j < result.length()){
            if(ch[i] == result.charAt(j)){
                i++;
                j++;
            }
            else if(i < ch.length - 1 && ch[i] == 'R' && result.charAt(j) == 'X' && ch[i + 1] == 'X'){
                char temp = ch[i + 1];
                ch[i + 1] = ch[i];
                ch[i] = temp;
                i++;
                j++;
            }
            else if(i < ch.length - 1 && ch[i] == 'X' && result.charAt(j) == 'L' && ch[i + 1] == 'L'){
                char temp = ch[i + 1];
                ch[i + 1] = ch[i];
                ch[i] = temp;
                i++;
                j++;
            }
            else if(i == ch.length - 1 && j == result.length() - 1 && ch[i] == result.charAt(j)){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
