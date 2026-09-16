package com.java.DSA.LeetCodeDebugging;

public class Solution33 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        int iNew = i + 1;
        int jNew = j - 1;
        boolean b1 = true,b2 = true;
        while(iNew < j){
            if(s.charAt(iNew) == s.charAt(j)){
                iNew++;
                j--;
            }
            else{
                b1 = false;
                break;
            }
        }
        while(i < jNew){
            if(s.charAt(i) == s.charAt(jNew)){
                i++;
                jNew--;
            }
            else{
                b2 = false;
                break;
            }
        }
        return b1 || b2;
    }
}
