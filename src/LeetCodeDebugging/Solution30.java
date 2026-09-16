package com.java.DSA.LeetCodeDebugging;

public class Solution30 {
    public String interpret(String command) {
        String s = command.replaceAll("\\(\\)","o");
        String x = "";
        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i) != '(')
                x += s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i) != ')')
                x += s.charAt(i);
        }
        return s;
    }
}
