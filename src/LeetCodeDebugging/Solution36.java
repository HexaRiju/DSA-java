package com.java.DSA.LeetCodeDebugging;

import java.util.Stack;

public class Solution36 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(stack.peek() == set(s.charAt(i)))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.size() == 0;
    }
    public char set(char ch){
        switch(ch){
            case ')':return '(';
            case '(':return ')';
            case '[':return ']';
            case ']':return '[';
            case '{':return '}';
            default :return '{';
        }
    }
}
