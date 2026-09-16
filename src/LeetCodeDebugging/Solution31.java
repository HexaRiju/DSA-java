package com.java.DSA.LeetCodeDebugging;

public class Solution31 {
    public String reverseWords(String s) {
        StringBuffer r = new StringBuffer("");
        for(int i = s.length() - 1; i >= 0; i--){
            r.append(s.charAt(i));
        }
        String[] x = r.toString().split(" ");
        StringBuffer p = new StringBuffer(x[x.length-1]);
        for(int i = x.length - 2; i >= 0; i--){
            p.append(" ");
            p.append(x[i]);
        }
        return p.toString();
    }
}
